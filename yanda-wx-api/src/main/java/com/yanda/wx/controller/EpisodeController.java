package com.yanda.wx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanda.core.entity.EpisodeDetailInfo;
import com.yanda.core.entity.generated.EpisodeInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.service.EpisodeService;
import com.yanda.core.service.MovieService;
import com.yanda.core.web.BaseController;

/**
 * 视频集相关接口控制类 特别说明： 视频里包含视频集 EpisodeController.java
 * 
 * @author chenli
 * @time 2018年3月7日 下午10:07:56
 */
@RestController
@RequestMapping(value = "/episode")
public class EpisodeController extends BaseController {
	/**
	 * 视频服务类
	 */
	@Autowired
	private MovieService movieService;
	/**
	 * 视频集服务类
	 */
	@Autowired
	private EpisodeService episodeService;



	/**
	 * 根据视频集ID获取视频集详细信息
	 * 
	 * @param request
	 * @param id
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/getDetailEpisode/{id}", method = RequestMethod.GET)
	public EpisodeDetailInfo getEpisode(HttpServletRequest request, @PathVariable Long id) throws DOPException {
		return episodeService.findEpisodeDetailInfoById(id);
	}


	/**
	 * 获取视频集id、集数
	 * 
	 * @param request
	 * @param mvId
	 * @return
	 * @throws DOPException
	 */
	@RequestMapping(value = "/episodes/{mvId}", method = RequestMethod.GET)
	public List<EpisodeInfo> getEpisodesByMvId(HttpServletRequest request, @PathVariable Long mvId)
			throws DOPException {
		return episodeService.getSimpleEpisodeByMvId(mvId);
	}

}
