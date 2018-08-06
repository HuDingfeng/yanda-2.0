package com.yanda.wx.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.JsonResult;
import com.yanda.core.entity.MovieDetailInfo;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.ClassifyInfo;
import com.yanda.core.entity.generated.MovieInfo;
import com.yanda.core.entity.generated.UserSearchInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.MovieService;
import com.yanda.core.service.UserSearchService;
import com.yanda.core.util.SortUtil;
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
	@Autowired
	private UserSearchService userSearchService;

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
	@RequestMapping(value = "/getPubMovies", method = RequestMethod.GET)
	public JsonResult getMovies(HttpServletRequest request) {
		String pageNum = getValue(request, "pageNum", "1");
		String pageSize = getValue(request, "pageSize", "4");
		String classifyId = getValue(request, "classifyId", "0");
		PageResult<MovieDetailInfo> mvDetailInfos = movieService.getPubMovies(Integer.valueOf(classifyId),
				Integer.valueOf(pageNum), Integer.valueOf(pageSize));
		return result(200, "success", mvDetailInfos);
	}

	/**
	 * 根据视频名称或简介搜索视频
	 * 
	 * @param request
	 * @param id
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public JsonResult searchMovie(Integer classifyId, String keyword, Integer userId,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "size", defaultValue = "10") Integer size, String sort, String order)
			throws DOPException {

		String sortWithOrder = SortUtil.mvSort(sort, order);

		// 添加到搜索历史
		if (userId != null && StringUtil.isNotEmpty(keyword)) {
			UserSearchInfo searchHistoryVo = new UserSearchInfo();
			searchHistoryVo.setAddTime(new Date());
			searchHistoryVo.setKeyword(keyword);
			searchHistoryVo.setUserId(userId);
			userSearchService.upsertSelective(searchHistoryVo);
		}

		// 查询列表数据
		PageResult<MovieInfo> pageResult = movieService.querySelective(classifyId, keyword, page, size, sortWithOrder);

		// 查询商品所属类目列表。
		List<Integer> classifyIds = movieService.getClassifyIds(keyword);
		List<ClassifyInfo> classifyList = null;
		if (classifyIds.size() != 0) {
			classifyList = movieService.findClassifyListByIds(classifyIds);
		}

		Map<String, Object> data = new HashMap<>();
		data.put("mvList", pageResult.getList());
		data.put("filterclassifyList", classifyList);
		data.put("count", pageResult.getTotal());

		return result(200, "success", data);
	}
	
	/**
	 * 获取最新电影
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@GetMapping(value = "/recent")
	public Object getRecentMovies(HttpServletRequest request) throws Exception {
		String time = request.getParameter("time");
		Date createTime = DateUtils.parseDate(time, new String[]{"yyyy-MM-dd hh:mm:ss"});
		List<MovieInfo> movie = movieService.findRecentMoviesByCreateTime(createTime);
		return result(200, "success", movie);
	}

}
