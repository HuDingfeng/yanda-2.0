package com.yanda.core.service.impl;


import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.UserAgreeInfo;
import com.yanda.core.entity.generated.UserAgreeInfoExample;
import com.yanda.core.mapper.generated.UserAgreeInfoMapper;
import com.yanda.core.service.UserAgreeService;

@Service
public class UserAgreeServiceImpl extends BaseServiceImpl<UserAgreeInfoMapper, UserAgreeInfo, Long> implements UserAgreeService {

	
	@Override
	public UserAgreeInfo selectByCommentIdAndUserId(Long commentId, Long userId) {
		// TODO Auto-generated method stub
		UserAgreeInfoExample example = new UserAgreeInfoExample();
		example.createCriteria().andCommentIdEqualTo(commentId).andUserIdEqualTo(userId);
		UserAgreeInfo userAgreeInfo = mapper.selectOneByExample(example);
		return userAgreeInfo;
	}

	@Override
	public PageResult<UserAgreeInfo> list(Long userId, Long episodeId) {
		// TODO Auto-generated method stub
		Page<UserAgreeInfo> pageInfo = PageHelper.startPage(1, 1000); 		//一次性获取1000条数据
		UserAgreeInfoExample example = new UserAgreeInfoExample();
		example.createCriteria().andUserIdEqualTo(userId).andEpisodeIdEqualTo(episodeId).andHasAgreeEqualTo(1);
		mapper.selectByExample(example);
		PageResult<UserAgreeInfo> pageResult = new PageResult<>(pageInfo.getTotal(), pageInfo.getPageNum(), 
				pageInfo.getPageSize(), pageInfo.getResult());
		return pageResult;
	}

}
