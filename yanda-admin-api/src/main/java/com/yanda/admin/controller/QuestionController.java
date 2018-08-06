package com.yanda.admin.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.AttachmentInfo;
import com.yanda.core.entity.generated.QuestionInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.QuestionService;
import com.yanda.core.util.StringUtil;
import com.yanda.core.web.BaseController;

@RestController
@RequestMapping(value = "/question")
public class QuestionController extends BaseController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/list")
	public JsonResult getList(HttpServletRequest request, 
			@RequestParam(name = "pageNum", defaultValue = "1", required = false) Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10", required = false) Integer pageSize,
			@RequestParam(name = "searchVal", defaultValue = "", required = false) String searchVal) {
		
		PageResult<QuestionInfo> qInfos = questionService.getList(pageNum, pageSize, searchVal);
		
		return result(200, "success", qInfos);
	}
	
	/**
	 * 新增题目
	 * @param request
	 * @param qInfo
	 * @return
	 * @throws DOPException
	 */
	@PostMapping("/add")
	public JsonResult add(HttpServletRequest request, @RequestBody QuestionInfo qInfo) throws DOPException {
		AttachmentInfo imgAttach = handleImgAttach(request);
		AttachmentInfo videoAttach = handleVideoAttach(request);
		if (videoAttach != null) {
			String filePath = fileConfig.getUploadPath() + "/" + fileConfig.getBaseVideoDir() + "/"
					+ videoAttach.getNewFilename();
			videoAttach.setFilePath(filePath);
		}
		
		
		Date now = new Date();
		qInfo.setCreateTime(now);
		qInfo.setUpdateTime(now);
		
		String classifyIdStr = qInfo.getClassifyId();
		int module = qInfo.getModule();
		int[] classifyIdArr = StringUtil.stringToInts(classifyIdStr, "/");
		qInfo.setClassifyNj(classifyIdArr[0]);
		if (module == 1) {
			qInfo.setClassifyZ(classifyIdArr[1]);
			qInfo.setClassifyJ(classifyIdArr[2]);
		} else if (module == 2) {
			qInfo.setClassifyDy(classifyIdArr[1]);
		} else if (module == 3) {
			qInfo.setClassifyQ(classifyIdArr[1]);
		}
		
		questionService.save(qInfo, imgAttach, videoAttach);
		
		return result(200, "保存成功");
	}
	
	/**
	 * 新增题目
	 * @param request
	 * @param qInfo
	 * @return
	 * @throws DOPException
	 */
	@PostMapping("/update")
	public JsonResult update(HttpServletRequest request, @RequestBody QuestionInfo qInfo) throws DOPException {
		AttachmentInfo imgAttach = handleImgAttach(request);
		AttachmentInfo videoAttach = handleVideoAttach(request);
		if (videoAttach != null) {
			String filePath = fileConfig.getUploadPath() + "/" + fileConfig.getBaseVideoDir() + "/"
					+ videoAttach.getNewFilename();
			videoAttach.setFilePath(filePath);
		}
		
		Date now = new Date();
		qInfo.setUpdateTime(now);
		
		questionService.update(qInfo, imgAttach, videoAttach);
		
		return result(200, "更新成功");
	}
	
	/**
	 * 删除题目
	 * @param request
	 * @param id
	 * @return
	 * @throws DOPException
	 */
	@PostMapping("/delete/{id}")
	public JsonResult delete(HttpServletRequest request, @PathVariable Long id) throws DOPException {
		questionService.deleteById(id);
		
		return result(200, "删除成功");
	}
	
	/**
	 * 批量删除题目
	 * @param request
	 * @return
	 * @throws DOPException
	 */
	@PostMapping("/batchDelete")
	public JsonResult delete(HttpServletRequest request) throws DOPException {
		String ids = getNotEmptyValue(request, "ids");
		long idsArr[] = StringUtil.stringToLongs(ids);
		
		for (long id : idsArr) {
			questionService.deleteById(id);
		}
		
		return result(200, "删除成功");
	}
	
	@GetMapping("/getQuestion/{id}")
	public JsonResult getQuestion(HttpServletRequest request, @PathVariable Long id) throws DOPException {
		QuestionInfo qInfo = questionService.selectById(id);
		return result(200, "success", qInfo);
	}
}
