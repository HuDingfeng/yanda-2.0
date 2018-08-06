package com.yanda.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.service.QuestionService;
import com.yanda.core.web.BaseController;

@RestController
@RequestMapping(value = "/question")
public class QuestionController extends BaseController {
	
	@Autowired
	private QuestionService questionService;
	

}
