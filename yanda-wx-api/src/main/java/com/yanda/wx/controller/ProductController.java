package com.yanda.wx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.service.ProductService;
import com.yanda.core.web.BaseController;

@RestController
@RequestMapping("/product")
public class ProductController extends BaseController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public Object getList(HttpServletRequest request) {
		return result(200, "success", productService.findAll());
	}
	
}
