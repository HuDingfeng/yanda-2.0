package com.yanda.wx.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import com.alibaba.fastjson.JSON;
import com.yanda.core.component.MessageSender;
import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.UserDetailInfo;
import com.yanda.core.entity.generated.UserInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.UserService;
import com.yanda.core.util.Const;
import com.yanda.core.util.DesEncryptUtil;
import com.yanda.core.util.RestTemplateUtil;
import com.yanda.core.util.StringUtil;
import com.yanda.core.web.BaseController;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	@Autowired
	private MessageSender messageSender;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public JsonResult login(HttpServletRequest request, HttpServletResponse response) {
		String userName = getNotEmptyValue(request, "userName");
		if (StringUtil.isEmpty(userName)) {
			return result(-1, "请填写登录账户");
		}
		String password = getNotEmptyValue(request, "password");
		if (StringUtil.isEmpty(password)) {
			return result(-1, "请填写登录密码");
		}
		password = HtmlUtils.htmlUnescape(password);
		UserInfo userInfo = userService.login(userName, password);
		if (userInfo == null) {
			return result(-1, "用户名密码错误");
		}
		if (userInfo.getStatus().intValue() != 1) {
			return result(-1, "该账号已被停用");
		}

		UserDetailInfo user = userService.findUserDetailByUserId(userInfo.getUserId());

		String str = new Date().getTime() + "&" + user.getUserName();
		String token = DesEncryptUtil.encryptToHex(str.getBytes(), Const.KEY_DATA);
		// 将token存入redis缓存，token作为小程序端调用接口和判断是否登录的唯一凭证
		redisTemplate.opsForHash().put(Const.TOKEN_KEY_PRE, user.getUserName(), token);
		redisTemplate.expire(Const.TOKEN_KEY_PRE + user.getUserName(), Const.TOKEN_EXPIRE, TimeUnit.DAYS);

		Map<String, Object> map = new HashMap<>();
		map.put("token", token);
		map.put("userInfo", user);
		return result(200, "success", map);
	}

	/**
	 * 检查token的有效性
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/checkToken", method = RequestMethod.POST)
	public JsonResult checkToken(HttpServletRequest request) {
		String terminal = request.getHeader("terminal");
		String token = request.getHeader("token");
		if (StringUtil.isNotEmpty(terminal) && terminal.equals("wechat")) {
			if (StringUtil.isEmpty(token))
				return result(401, "请先登录");
			String userName = "";
			try {
				String decryToken = DesEncryptUtil.decrypt(token, Const.KEY_DATA);
				userName = decryToken.split("&")[1];
			} catch (Exception e) {
				LOG.error("token值非法", e);
				return result(401, "登录凭证非法,请重新登录");
			}

			Object userToken = redisTemplate.opsForHash().get(Const.TOKEN_KEY_PRE, userName);
			if (null == userToken || !userToken.toString().equals(token)) {
				return result(401, "登录状态已失效,请重新登录");
			}
			// 重新刷新token有效期
			redisTemplate.opsForHash().put(Const.TOKEN_KEY_PRE, userName, token);
			redisTemplate.expire(Const.TOKEN_KEY_PRE + userName, Const.TOKEN_EXPIRE, TimeUnit.DAYS);
		}
		return result(200, "验证通过");
	}

	/**
	 * 通过openid查询该微信用户是否存在
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/findWechatIsExist", method = RequestMethod.GET)
	public JsonResult findWechatIsExist(HttpServletRequest request) {
		String openId = getNotEmptyValue(request, "openId");
		if (StringUtil.isEmpty(openId))
			return result(-1, "openid为空");
		UserInfo user = userService.findWechatIsExist(openId);
		return result(200, "success", user);

	}

	/**
	 * 通过微信注册用户
	 * 
	 * @param request
	 * @return
	 */
	@CacheEvict(value = { "userList" }, allEntries = true, beforeInvocation = true)
	@RequestMapping(value = "/registerByWechat", method = RequestMethod.POST)
	public JsonResult registerByWechat(HttpServletRequest request) {
		String openId = getNotEmptyValue(request, "openId");
		if (StringUtil.isEmpty(openId))
			return result(-1, "openid为空");
		String avatar = getNotEmptyValue(request, "avatar");
		// 随机生成一个字符串作为用户名
		String userName = StringUtil.generateRandomWord(12, "wx");
		// 随机生成一个字符串作为密码
		String password = StringUtil.generateRandomCodeMixed(8);
		String nickName = getNotEmptyValue(request, "nickName");
		if (StringUtil.isEmpty(nickName)) {
			nickName = userName;
		}
		String sexStr = getNotEmptyValue(request, "sex");
		int sex = 3;
		if (StringUtil.isNotEmpty(sexStr)) {
			sex = Integer.valueOf(sexStr);
		}

		try {
			UserInfo userInfo = new UserInfo();
			Date crTime = new Date();
			userInfo.setUserName(userName);
			userInfo.setPassword(password);
			userInfo.setNickName(nickName);
			userInfo.setCreateTime(crTime);
			userInfo.setUpdateTime(crTime);
			userInfo.setSex(sex);
			userInfo.setAvatar(avatar);
			userInfo.setIsWechat(true);
			userInfo.setOpenId(openId);
			userService.save(userInfo);
			return result(200, "注册成功", userInfo);
		} catch (DOPException e) {
			return result(-1, e.getMessage());
		}
	}

	/**
	 * 调用微信接口获取openid
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getOpenIdFromWeiXin", method = RequestMethod.GET)
	public JsonResult getOpenIdFromWeiXin(HttpServletRequest request) {
		String js_code = getNotEmptyValue(request, "js_code");
		if (StringUtil.isEmpty(js_code))
			return result(-1, "js_code为空");
		Map<String, Object> para = new HashMap<>();
		para.put("appid", Const.appId);
		para.put("secret", Const.appSecret);
		para.put("js_code", js_code);
		para.put("grant_type", "authorization_code");
		String result = RestTemplateUtil.getForObject("https://api.weixin.qq.com/sns/jscode2session", String.class,
				para);
		return result(200, "success", JSON.parse(result));

	}

	/**
	 * 发送短信验证码
	 * 
	 * @param userId
	 * @param mobile
	 * @return
	 */
	@PostMapping(value = "/sendCode")
	public JsonResult sendCode(String userId, String mobile) {
		if (StringUtil.isEmpty(userId))
			return result(-1, "用户ID为空");
		if (StringUtil.isEmpty(mobile))
			return result(-1, "手机号为空");
		Random rad = new Random();
		String code = rad.nextInt(10000) + "";
		messageSender.sendMessage(code, mobile);
		redisTemplate.opsForHash().put(Const.CODE_KEY_PRE, userId, code);
		redisTemplate.expire(Const.CODE_KEY_PRE + userId, Const.CODE_EXPIRE, TimeUnit.MINUTES);
		return result(200, "发送成功");
	}

	/**
	 * 发送短信验证码
	 * 
	 * @param userId
	 * @param mobile
	 * @return
	 */
	@PostMapping(value = "/bindMobile")
	public JsonResult bindMobile(String userId, String mobile, String code) {
		if (StringUtil.isEmpty(userId))
			return result(-1, "用户ID为空");
		if (StringUtil.isEmpty(mobile))
			return result(-1, "手机号为空");
		if (StringUtil.isEmpty(code))
			return result(-1, "验证码为空");
		Object redisCode = redisTemplate.opsForHash().get(Const.CODE_KEY_PRE, userId);
		if (null == redisCode || !redisCode.toString().equals(code))
			return result(-1, "验证码错误或已失效");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(Integer.valueOf(userId));
		userInfo.setMobile(mobile);
		try {
			userService.update(userInfo);
		} catch (DOPException e) {
			LOG.error("绑定用户手机号失败:" + e);
			return result(-1, "绑定失败");
		}
		return result(200, "绑定成功");
	}


}
