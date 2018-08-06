package com.yanda.wx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.BannerInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.BannerService;
import com.yanda.core.web.BaseController;


/**
 * 轮播图相关接口控制类
 * BannerController.java
 * @author chenli
 * @time 2018年3月7日 下午9:39:59
 */
@RestController
@RequestMapping(value = "/banner")
public class BannerController extends BaseController {

	@Autowired
	private BannerService bannerService;

	
	/**
	 * 获取轮播图列表数据
	 * @param request 请求体
	 * @param pageNum 页码
	 * @param pageSize 分页大小
	 * @param bannerDesc 轮播图描述
	 * @return
	 * @throws DOPException 
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JsonResult listBanners(HttpServletRequest request) throws DOPException {
		String pageNum = getValue(request, "pageNum", "1");
		String pageSize = getValue(request, "pageSize", "10");
		PageResult<BannerInfo> bannerInfos = bannerService.list(Integer.valueOf(pageNum), Integer.valueOf(pageSize),
				"");
		return result(200, "success", bannerInfos);
	}

}
