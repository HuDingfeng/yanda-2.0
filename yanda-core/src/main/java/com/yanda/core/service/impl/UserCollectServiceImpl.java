package com.yanda.core.service.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.UserCollectDetailInfo;
import com.yanda.core.entity.generated.UserCollectInfo;
import com.yanda.core.entity.generated.UserCollectInfoExample;
import com.yanda.core.exception.DOPException;
import com.yanda.core.mapper.UserCustomMapper;
import com.yanda.core.mapper.generated.UserCollectInfoMapper;
import com.yanda.core.service.UserCollectService;

@Service
public class UserCollectServiceImpl extends BaseServiceImpl<UserCollectInfoMapper, UserCollectInfo, Long> implements UserCollectService {

	@Autowired
	private UserCustomMapper userCostomMapper;

	
	@Override
	public PageResult<UserCollectDetailInfo> findUserCollectsByUserId(Long userId, int pageNum, int pageSize) {
		Page<UserCollectDetailInfo> pageInfo = PageHelper.startPage(pageNum, pageSize);
		userCostomMapper.findUserCollectDetailByUserId(userId);
		PageResult<UserCollectDetailInfo> pageResult = new PageResult<>(pageInfo.getTotal(), pageInfo.getPageNum(), 
				pageInfo.getPageSize(), pageInfo.getResult());
		return pageResult;
	}

	@Override
	public void deleteByCollectId(Long collectId) throws DOPException {
		this.deleteById(collectId);
	}

	@Override
	public boolean addByUIdAndEpisodeId(Long userId, Long episodeId) throws DOPException {
		UserCollectInfoExample example = new UserCollectInfoExample();
		example.createCriteria().andUserIdEqualTo(userId).andEpisodeIdEqualTo(episodeId);
		UserCollectInfo userCollectInfo = mapper.selectOneByExample(example);
		if(userCollectInfo == null) {
			userCollectInfo = new UserCollectInfo();
			userCollectInfo.setUserId(userId);
			userCollectInfo.setEpisodeId(episodeId);
			userCollectInfo.setCollectTime(new Date());
			this.save(userCollectInfo);
			return true;
		} else {
			return false;
		}
		
	}
	
	

}
