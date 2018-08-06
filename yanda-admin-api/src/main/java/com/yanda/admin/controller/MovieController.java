package com.yanda.admin.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.MovieDetailInfo;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.AttachmentInfo;
import com.yanda.core.entity.generated.MovieInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.exception.NullParamException;
import com.yanda.core.service.MovieService;
import com.yanda.core.util.StringUtil;
import com.yanda.core.web.BaseController;

/**
 * 视频相关接口控制类 MovieController.java
 * 
 * @author chenli
 * @time 2018年3月7日 下午10:23:34
 */
@RestController
@RequestMapping(value = "/movie")
public class MovieController extends BaseController {

	@Autowired
	private MovieService movieService;


	/**
	 * 获取包含视频分类路径的视频列表，可根据视频名称查询
	 * 
	 * @param request
	 *            请求体
	 * @param pageNum
	 *            页码
	 * @param pageSize
	 *            分页大小
	 * @param mvName
	 *            视频名称
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JsonResult listMovies(HttpServletRequest request) {
		String pageNum = getValue(request, "pageNum", "1");
		String pageSize = getValue(request, "pageSize", "4");
		String searchVal = getNotEmptyValue(request, "searchVal");
		PageResult<MovieDetailInfo> mvDetailInfos = movieService.list(Integer.valueOf(pageNum),
				Integer.valueOf(pageSize), searchVal);
		return result(200, "success", mvDetailInfos);
	}

	/**
	 * 添加一条视频记录
	 * 
	 * @param request
	 *            请求体
	 * @param movieInfo
	 *            视频实体
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public JsonResult add(HttpServletRequest request, @RequestBody MovieInfo movieInfo) throws DOPException {

		AttachmentInfo attachmentInfo = handleImgAttach(request);
		movieInfo.setCreateTime(attachmentInfo.getCreateTime());
		movieInfo.setUpdateTime(attachmentInfo.getCreateTime());
		movieInfo.setEpisodeCount(0);
		movieService.addMovie(movieInfo, attachmentInfo);
		return result(200, "success");

	}

	/**
	 * 更新一条视频记录
	 * 
	 * @param request
	 *            请求体
	 * @param movieInfo
	 *            视频实体
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public JsonResult update(HttpServletRequest request, @RequestBody MovieInfo movieInfo) throws DOPException {

		String oldFilename = request.getParameter("oldFilename");
		String newFilename = request.getParameter("newFilename");
		AttachmentInfo attachmentInfo = null;
		if (StringUtil.isNotEmpty(oldFilename) && StringUtil.isNotEmpty(newFilename)) {
			attachmentInfo = handleImgAttach(request);
		}
		movieInfo.setUpdateTime(new Date());
		movieService.updateMovie(movieInfo, attachmentInfo);
		return result(200, "success");

	}

	/**
	 * 删除一条视频 注意：删除的视频下不能包含有视频集
	 * 
	 * @param request
	 *            请求体
	 * @param id
	 *            视频id
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public JsonResult delete(HttpServletRequest request, @PathVariable("id") Long id) throws DOPException {

		movieService.deleteById(id);
		return result(200, "删除成功!");

	}

	/**
	 * 根据视频ID获取视频
	 * 
	 * @param request
	 * @param id
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public MovieInfo getMovie(HttpServletRequest request, @PathVariable Long id) throws DOPException {
		return movieService.selectById(id);
	}


	/**
	 * 发布或撤销发布视频
	 * 
	 * @param request
	 * @param mvId
	 * @param isPublic
	 * @return
	 * @throws DOPException
	 * @throws NullParamException
	 */
	@CacheEvict(value = "movieList", allEntries = true, beforeInvocation = true)
	@RequestMapping(value = "/pub", method = RequestMethod.POST)
	public JsonResult pubMovie(HttpServletRequest request) throws DOPException, NullParamException {
		String mvId = getNotEmptyValue(request, "mvId");
		if (StringUtil.isEmpty(mvId))
			throw new NullParamException("视频编号");
		String isPublic = getNotEmptyValue(request, "isPublic");
		if (StringUtil.isEmpty(mvId))
			throw new NullParamException("发布状态值");

		Long id = Long.valueOf(mvId);
		int ispublicVal = Integer.valueOf(isPublic).intValue();
		MovieInfo movieInfo = new MovieInfo();
		movieInfo.setMvId(id);
		movieInfo.setIsPublic(ispublicVal == 1);
		if (ispublicVal == 1) {
			movieInfo.setPublicTime(new Date());
		}
		movieService.update(movieInfo);

		return result(200, "success");
	}
	
	
}
