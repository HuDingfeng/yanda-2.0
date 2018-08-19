package com.yanda.admin.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.ClsTypeEnum;
import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.WebClassifyInfo;
import com.yanda.core.entity.generated.ClassifyInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.ClassifyService;
import com.yanda.core.util.StringUtil;
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
	 * 获取列表数据
	 * 
	 * @param request
	 *            请求体
	 * @param pageNum
	 *            页码
	 * @param pageSize
	 *            分页大小
	 * @param bannerDesc
	 *            轮播图描述
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JsonResult list(HttpServletRequest request) {
		Integer pageNum = getIntValue(request, "pageNum", 1);
		Integer pageSize = getIntValue(request, "pageSize", 10);
		String classifyName = getNotEmptyValue(request, "classifyName");
		Integer classifyType = getIntValue(request, "classifyType", ClsTypeEnum.MOVIE.value);
		PageResult<ClassifyInfo> ClassifyInfos = classifyService.list(pageNum,
				pageSize, classifyType, classifyName);
		return result(200, "success", ClassifyInfos);
	}

	/**
	 * 根据分类父id和分类类型id获取分类列表
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getClassifyById")
	public JsonResult getClassifyById(HttpServletRequest request, Integer parentId) {
		Integer pageNum = getIntValue(request, "pageNum", 1);
		Integer pageSize = getIntValue(request, "pageSize", 10);
		String searchVal = getNotEmptyValue(request, "searchVal");
		Integer classifyType = getIntValue(request, "classifyType", ClsTypeEnum.MOVIE.value);
		
		PageResult<ClassifyInfo> ClassifyInfos = classifyService.getClassifyById(Integer.valueOf(pageNum),
				Integer.valueOf(pageSize), parentId, classifyType, searchVal);
		return result(200, "success", ClassifyInfos);
	}

	/**
	 * 添加
	 * 
	 * @param request
	 *            请求体
	 * @param ClassifyInfo
	 * @return
	 * @throws DOPException 
	 */
	@CacheEvict(value = { "classifyList", "webClassifyList" }, allEntries = true, beforeInvocation = true)
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public JsonResult add(HttpServletRequest request, @RequestBody ClassifyInfo ClassifyInfo) throws DOPException {
		Date date = new Date();
		ClassifyInfo.setCreateTime(date);
		ClassifyInfo.setUpdateTime(date);
		classifyService.save(ClassifyInfo);
		return result(200, "success");

	}

	/**
	 * 删除
	 * 
	 * @param request
	 *            请求体
	 * @param id
	 *            轮播图实体id
	 * @return
	 */
	@CacheEvict(value = { "classifyList", "webClassifyList" }, allEntries = true, beforeInvocation = true)
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public JsonResult delete(HttpServletRequest request, @PathVariable("id") Integer id) {

		try {
			classifyService.deleteById(id);
			return result(200, "删除成功!");
		} catch (Exception e) {
			LOG.error("删除图片失败!", e);
			return result(-1, e.getMessage());
		}
	}

	/**
	 * 批量删除
	 * 
	 * @param request
	 *            请求体
	 * @param ids
	 *            ids字符串以","拼接
	 * @return
	 */
	@CacheEvict(value = { "classifyList", "webClassifyList" }, allEntries = true, beforeInvocation = true)
	@RequestMapping(value = "/batchDelete/{ids}", method = RequestMethod.POST)
	public JsonResult batchDelete(HttpServletRequest request, @PathVariable("ids") String ids) {
		try {
			int[] idArr = StringUtil.stringToInts(ids);
			for (int id : idArr) {
				classifyService.deleteById(id);
			}
			return result(200, "删除成功!");
		} catch (Exception e) {
			LOG.error("删除图片失败!", e);
			return result(-1, e.getMessage());
		}
	}

	/**
	 * 更新
	 * 
	 * @param request
	 *            请求体
	 * @param ClassifyInfo
	 *            轮播图实体
	 * @return
	 */
	@CacheEvict(value = { "classifyList", "webClassifyList" }, allEntries = true, beforeInvocation = true)
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public JsonResult update(HttpServletRequest request, @RequestBody ClassifyInfo ClassifyInfo) {
		ClassifyInfo.setUpdateTime(new Date());
		try {
			classifyService.update(ClassifyInfo);
			return result(200, "更新成功!");
		} catch (DOPException e) {
			return result(-1, "更新失败:" + e.getMessage());
		}
	}
	
	/**
	 * 根据年级id和题目类型获取分类树
	 * @param request
	 * @param id
	 * @param type
	 * @return
	 */
	@RequestMapping(value = "/getTreeByType")
	public List<WebClassifyInfo> getTreeByType(HttpServletRequest request, @RequestParam Integer type) {
		return classifyService.findTreeByType(type);
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
