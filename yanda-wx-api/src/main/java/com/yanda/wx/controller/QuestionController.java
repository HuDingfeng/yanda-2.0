package com.yanda.wx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.generated.QuestionInfo;
import com.yanda.core.service.QuestionService;
import com.yanda.core.web.BaseController;

@RestController
@RequestMapping(value = "/question")
public class QuestionController extends BaseController {
	
	@Autowired
	private QuestionService questionService;
	
	/**
	 * 获取指定类型下的习题
	 * @param request
	 * @param id
	 * @param module
	 * @return
	 */
	@GetMapping("/list")
	public JsonResult list(HttpServletRequest request, Integer id, Integer module) {
		List<QuestionInfo> qInfos = questionService.list(id, module);
		return result(200, "success", qInfos);
	}
	
	/**
	 * 获取专题练习或知识巩固题目总数
	 * @param request
	 * @param id
	 * @param module
	 * @return
	 */
	@GetMapping("/total")
	public JsonResult total(HttpServletRequest request, Integer id, Integer module) {
		Integer total = questionService.getTotal(id, module);
		return result(200, "success", total);
	}
	
}
