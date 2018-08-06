package com.yanda.admin.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.PageResult;
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
	 * 获取会员卡列表数据
	 * @param request 请求体
	 * @param pageNum 页码
	 * @param pageSize 分页大小
	 * @param cardNum 会员卡描述
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JsonResult listBanners(HttpServletRequest request) {
		String pageNum = getValue(request, "pageNum", "1");
		String pageSize = getValue(request, "pageSize", "10");
		String searchVal = getNotEmptyValue(request, "searchVal");
		PageResult<VipCardInfo> VipCardInfos = vipCardService.getList(Integer.valueOf(pageNum), Integer.valueOf(pageSize),
				searchVal);
		return result(200, "success", VipCardInfos);
	}
	
	/**
	 * 添加一张会员卡图
	 * @param request 请求体
	 * @param VipCardInfo 会员卡实体对象
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public JsonResult add(HttpServletRequest request, @RequestBody VipCardInfo VipCardInfo) {
		Integer days = VipCardInfo.getPurchaseDays();
		if (null == days)
			return result(-1, "购买月数不能为空");
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		VipCardInfo.setCreateTime(now);
		VipCardInfo.setUpdateTime(now);
		VipCardInfo.setPurchaseDays(days);
		try {
			vipCardService.save(VipCardInfo);
			return result(200, "success");
		} catch (Exception e) {
			LOG.error("添加会员卡异常", e);
			return result(-1, "添加失败！");
		}
	}
	
	/**
	 * 批量生成会员卡
	 * @param request 请求体
	 * @param VipCardInfo 会员卡实体对象
	 * @return
	 * @throws DOPException 
	 * @throws  
	 */
	@RequestMapping(value = "/batchAdd", method = RequestMethod.POST)
	public JsonResult batchAdd(HttpServletRequest request) throws Exception {
		String purchaseDays = getNotEmptyValue(request, "purchaseDays");
		if (StringUtil.isEmpty(purchaseDays)) 
			return result(-1, "会员天数不能为空");
		
		String count = getNotEmptyValue(request, "count");
		if (StringUtil.isEmpty(count)) 
			return result(-1, "生成个数不能为空");
		
		String isForever = getNotEmptyValue(request, "isForever");
		if (StringUtil.isEmpty(isForever)) 
			return result(-1, "请选择是否永久会员");
		
		String random = getValue(request, "random", "1");
		
		String cardPassword = "";
		if (random.equals("0")) {
			cardPassword = getNotEmptyValue(request, "cardPassword");
			if (StringUtil.isEmpty(cardPassword))
				return result(-1, "密码不能为空");
		}
		
		
		vipCardService.batchGenerate(random.equals("1") ? true : false, cardPassword, Integer.valueOf(purchaseDays), Boolean.valueOf(isForever), Integer.valueOf(count));
		
		return result(200, "生成成功");
	}
	
	@RequestMapping(value = "/getVipCardNum", method = RequestMethod.GET)
	public String geVipCardNum(HttpServletRequest request) {
		return vipCardService.getVipCardNum();
	}
	
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
	 * 删除一张会员卡
	 * @param request 请求体
	 * @param id 会员卡实体id
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public JsonResult delete(HttpServletRequest request, @PathVariable("id") Integer id) throws Exception {
		vipCardService.deleteById(id);
		return result(200, "删除成功!");
	}
	
	/**
	 * 批量删除会员卡
	 * @param request 请求体
	 * @param ids 会员卡实体ids字符串以","拼接
	 * @return
	 */
	@RequestMapping(value = "/batchDelete/{ids}", method = RequestMethod.POST)
	public JsonResult batchDelete(HttpServletRequest request, @PathVariable("ids") String ids) {
		try {
			int[] idArr = StringUtil.stringToInts(ids);
			for (int id : idArr) {
				vipCardService.deleteById(id);
			}
			return result(200, "删除成功!");
		} catch (Exception e) {
			LOG.error("删除失败!", e);
			return result(-1, e.getMessage());
		}
	}
	
	/**
	 * 续费会员卡
	 * @param request 请求体
	 * @param VipCardInfo 会员卡实体
	 * @return
	 * @throws DOPException 
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public JsonResult update(HttpServletRequest request, @RequestBody VipCardInfo VipCardInfo) throws DOPException {
		String addDays = getNotEmptyValue(request, "addDays");
		if (StringUtil.isNotEmpty(addDays)) {
			int addDaysVal = Integer.valueOf(addDays);
			Calendar calendar = Calendar.getInstance();
			Date expTime = VipCardInfo.getExpTime();
			// 已绑定用户的会员卡才更新失效时间
			if (null != VipCardInfo.getUserId()) {
				// 若是会员卡已过了有效期再进行续费，日期从现在开始计算
				if (isVipExpire(expTime)) {
					calendar.setTime(new Date());
				} else {
					calendar.setTime(VipCardInfo.getExpTime());
				}
				calendar.add(Calendar.DAY_OF_MONTH, addDaysVal);
				VipCardInfo.setExpTime(calendar.getTime());
			}
			
			VipCardInfo.setPurchaseDays(VipCardInfo.getPurchaseDays().intValue() + Integer.valueOf(addDays));
		}
		VipCardInfo.setUpdateTime(new Date());
		vipCardService.update(VipCardInfo);
		return result(200, "更新成功!");

	}
	
	/**
	 * 绑定会员卡持卡人
	 * @param request 请求体
	 * @param VipCardInfo 会员卡实体
	 * @return
	 * @throws DOPException 
	 */
	@RequestMapping(value = "/bind", method = RequestMethod.POST)
	public JsonResult bind(HttpServletRequest request, @RequestBody VipCardInfo VipCardInfo) throws DOPException {
		Integer userId = VipCardInfo.getUserId();
		if (null == userId)
			return result(-1, "绑定的用户为空");
		if (null == VipCardInfo.getPurchaseDays())
			return result(-1, "无法获取会员卡购买时限");
		UserDetailInfo user = userService.findUserDetailByUserId(Integer.valueOf(userId));
		if (null != user.getVipCard()) 
			return result(-1, "该用户已绑定了会员卡");
		
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.DAY_OF_MONTH, VipCardInfo.getPurchaseDays());
		VipCardInfo.setExpTime(calendar.getTime());
		VipCardInfo.setUpdateTime(now);
		vipCardService.update(VipCardInfo);
		return result(200, "绑定成功!");
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
