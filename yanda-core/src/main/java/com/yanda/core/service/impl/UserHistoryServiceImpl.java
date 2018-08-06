package com.yanda.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.UserHistoryDetailInfo;
import com.yanda.core.entity.generated.UserHistoryInfo;
import com.yanda.core.entity.generated.UserHistoryInfoExample;
import com.yanda.core.exception.DOPException;
import com.yanda.core.mapper.UserCustomMapper;
import com.yanda.core.mapper.generated.UserHistoryInfoMapper;
import com.yanda.core.service.UserHistoryService;

@Service
public class UserHistoryServiceImpl extends BaseServiceImpl<UserHistoryInfoMapper, UserHistoryInfo, Long> implements UserHistoryService {

	@Autowired
	private UserCustomMapper userCostomMapper;
	
	@Cacheable(value = "historyList")
	@Override
	public PageResult<UserHistoryDetailInfo> findUserHistoriesByUserId(Long userId, int pageNum, int pageSize) {
		Page<UserHistoryDetailInfo> pageInfo = PageHelper.startPage(pageNum, pageSize);
		userCostomMapper.findUserHistoryDetailByUserId(userId);
		PageResult<UserHistoryDetailInfo> pageResult = new PageResult<>(pageInfo.getTotal(), pageInfo.getPageNum(), 
				pageInfo.getPageSize(), pageInfo.getResult());
		return pageResult;
	}
	
	@CacheEvict(value = "historyList", allEntries=true, beforeInvocation=true)
	@Override
	public void deleteByHistoryId(Long historyId) throws DOPException {
		this.deleteById(historyId);
	}

	@CacheEvict(value = "historyList", allEntries=true, beforeInvocation=true)
	@Override
	public void upsertUserHistoryInfo(UserHistoryInfo userHistoryInfo) throws DOPException {
		UserHistoryInfoExample example = new UserHistoryInfoExample();
		example.createCriteria().andEpisodeIdEqualTo(userHistoryInfo.getEpisodeId()).andUserIdEqualTo(userHistoryInfo.getUserId());
		UserHistoryInfo userHistoryInfo2 = mapper.selectOneByExample(example);
		if(userHistoryInfo2 == null) {
			this.save(userHistoryInfo);
		} else {
			userHistoryInfo.setHistoryId(userHistoryInfo2.getHistoryId());
			this.update(userHistoryInfo);
		}
	}

	@Override
	public UserHistoryInfo findByUserIdAndEpisodeId(Long userId, Long episodeId) {
		UserHistoryInfoExample example = new UserHistoryInfoExample();
		example.createCriteria().andUserIdEqualTo(userId).andEpisodeIdEqualTo(episodeId);
		UserHistoryInfo userHistoryInfo = mapper.selectOneByExample(example);
		return userHistoryInfo;
	}
	
	@CacheEvict(value = "historyList", allEntries=true, beforeInvocation=true)
	@Override
	public void deleteByIdList(List<Long> ids) throws DOPException {
		for(Long id: ids) {
			this.deleteById(id);
		}
		
	}

}
