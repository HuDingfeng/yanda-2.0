package com.yanda.wx.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.UserDetailInfo;
import com.yanda.core.entity.generated.ProductInfo;
import com.yanda.core.entity.generated.VipCardInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.ProductService;
import com.yanda.core.service.UserService;
import com.yanda.core.service.VipCardService;
import com.yanda.core.util.StringUtil;
import com.yanda.core.web.BaseController;

@RestController
@RequestMapping(value = "/vip")
public class VipCardController extends BaseController {
	
	@Autowired
	private VipCardService vipCardService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	
	/**
	 * 客户购买会员后为客户绑定会员卡
	 * @param request
	 * @return
	 * @throws DOPException 
	 * @throws NumberFormatException 
	 */
	@RequestMapping(value = "/buy", method = RequestMethod.POST)
	public JsonResult buyByClient(HttpServletRequest request) throws Exception {
		String productId = getNotEmptyValue(request, "productId");
		if (StringUtil.isEmpty(productId))
			return result(-1, "会员产品id不能为空");
		String userId = getNotEmptyValue(request, "userId");
		if (StringUtil.isEmpty(userId)) 
			return result(-1, "用户id不能为空");
		String nickName = getValue(request, "nickName", "");
		VipCardInfo vipCardInfo = vipCardService.findByUserId(Integer.valueOf(userId));
		Date now = new Date();
		ProductInfo product = productService.selectById(Integer.valueOf(productId));
		int timeUnit = product.getTimeUnit();
		int timeNum = product.getTimeNum();
		
		if(vipCardInfo == null) {			// 购买会员
			vipCardInfo = new VipCardInfo();
			String cardNum = vipCardService.getVipCardNum();
			vipCardInfo.setCardNum(cardNum);
			if (timeUnit == 4) {
				vipCardInfo.setIsForever(true);
			}
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(now);
			calendar.add(getCalendarAddType(timeUnit), timeNum);
			long purchaseDays = (calendar.getTimeInMillis() - now.getTime()) / (1000 * 60 * 60 * 24);
			vipCardInfo.setCreateTime(now);
			vipCardInfo.setUpdateTime(now);
			vipCardInfo.setExpTime(calendar.getTime());
			vipCardInfo.setCardPassword("123456");
			vipCardInfo.setUserId(Integer.valueOf(userId));
			vipCardInfo.setNickName(nickName);
			vipCardInfo.setPurchaseDays(new Long(purchaseDays).intValue());
		} else {							// 续费会员
			Calendar calendar = Calendar.getInstance();
			Date expTime = vipCardInfo.getExpTime();
			if (isVipExpire(expTime)) {
				calendar.setTime(new Date());
			} else {
				calendar.setTime(expTime);
			}
			calendar.add(getCalendarAddType(timeUnit), timeNum);
			long purchaseDays = (calendar.getTimeInMillis() - expTime.getTime()) / (1000 * 60 * 60 * 24);
			if (timeUnit == 4) {
				vipCardInfo.setIsForever(true);
			}
			vipCardInfo.setUpdateTime(now);
			vipCardInfo.setExpTime(calendar.getTime());
			vipCardInfo.setPurchaseDays(vipCardInfo.getPurchaseDays().intValue() + new Long(purchaseDays).intValue());
		}
		try {
			vipCardService.upsertSelective(vipCardInfo);
			UserDetailInfo userDetailInfo = userService.findUserDetailByUserId(Integer.valueOf(userId));
			Map<String, Object> result = new HashMap<>();
			result.put("account", vipCardInfo.getCardNum());
			result.put("password", vipCardInfo.getCardPassword());
			result.put("expTime", vipCardInfo.getExpTime());
			result.put("user", userDetailInfo);
			return result(200, "success", result);
		} catch (Exception e) {
			LOG.error("购买会员失败", e);
			return result(-1, "添加失败！");
		}
	}
	
	
	/**
	 * 通过会员卡号绑定用户
	 * @param request
	 * @param VipCardInfo
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/bindByCardNum", method = RequestMethod.POST)
	public JsonResult bindByCardNum(HttpServletRequest request) throws Exception {
		String cardNum = getNotEmptyValue(request, "cardNum");
		if (StringUtil.isEmpty(cardNum))
			return result(-1, "卡号为空");
		String cardPassword = getNotEmptyValue(request, "cardPassword");
		if (StringUtil.isEmpty(cardPassword))
			return result(-1, "密码为空");
		String userId = getNotEmptyValue(request, "userId");
		if (StringUtil.isEmpty(userId))
			return result(-1, "绑定的用户为空");
		
		VipCardInfo vipCard = vipCardService.findByCardNumAndPassword(cardNum, cardPassword);
		if (null == vipCard)
			return result(-1, "卡号或密码错误");
		if (null != vipCard.getUserId())
			return result(-1, "该会员卡已被绑定");
		UserDetailInfo user = userService.findUserDetailByUserId(Integer.valueOf(userId));
		if (null != user.getVipCard()) 
			return result(-1, "您之前已绑定了会员卡，若已过期请再次购买进行续费");
		
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.DAY_OF_MONTH, vipCard.getPurchaseDays());
		
		vipCard.setExpTime(calendar.getTime());
		vipCard.setNickName(user.getNickName());
		vipCard.setUserId(Integer.valueOf(userId));
		vipCard.setUpdateTime(now);
		vipCardService.upsertSelective(vipCard);
		user = userService.findUserDetailByUserId(Integer.valueOf(userId));
		return result(200, "绑定成功!", user);
	}
	
	/**
	 * 根据计数方式获取日期添加类型
	 * @param timeUnit
	 * @return
	 */
	private int getCalendarAddType(int timeUnit) {
		if (timeUnit == 1) {
			return Calendar.YEAR;
		} else if (timeUnit == 2) {
			return Calendar.MONTH;
		} else if (timeUnit == 3) {
			return Calendar.DAY_OF_MONTH;
		} else {
			return Calendar.MONTH; 
		}
	}
	
	/**
	 * 判断会员卡是否已到期
	 * @param expireTime
	 * @return
	 */
	private boolean isVipExpire(Date expireTime) {
		Date now = new Date();
		if (expireTime.getTime() - now.getTime() <= 0)
			return true;
		return false;
	}
}
