package com.yanda.wx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.WebClassifyInfo;
import com.yanda.core.service.ClassifyService;
import com.yanda.core.util.PinYinUtil;
import com.yanda.core.web.BaseController;

/**
 * 分类接口 ClassifyController.java
 * 
 * @author chenli
 * @time 2018年5月5日 下午10:48:58
 */
@RestController
@RequestMapping(value = "/classify")
public class ClassifyController extends BaseController {

	@Autowired
	private ClassifyService classifyService;

	
	/**
	 * 获取中文拼音
	 * @param request
	 * @return
	 */
	@GetMapping(value = "/getPinyin")
	public String getPinyin(HttpServletRequest request) {
		String content = getNotEmptyValue(request, "content");
		return PinYinUtil.getPinYin(content, "upper");
	}
	
	@GetMapping(value = "/getListByType")
	public List<WebClassifyInfo> getListByType(HttpServletRequest request, Integer type) {
		return classifyService.findListByType(type);
	}
	
	@GetMapping(value = "/getChildListByParentId")
	public List<WebClassifyInfo> getChildListByParentId(HttpServletRequest request, Integer parentId) {
		return classifyService.findChildListByParentId(parentId);
	}
	
}
