package com.yanda.wx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.PaperInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.PaperService;
import com.yanda.core.web.BaseController;

@RestController
@RequestMapping(value = "/paper")
public class PaperController extends BaseController {
	
	@Autowired
	private PaperService paperService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JsonResult listBanners(HttpServletRequest request) throws DOPException {
		String pageNum = getValue(request, "pageNum", "1");
		String pageSize = getValue(request, "pageSize", "10");
		String searchVal = getNotEmptyValue(request, "searchVal");
		String paperType = getValue(request, "paperType", "1");
		PageResult<PaperInfo> papers = paperService.getList(Integer.valueOf(pageNum), Integer.valueOf(pageSize),
				searchVal, Integer.valueOf(paperType));
		return result(200, "success", papers);
	}
	
}
