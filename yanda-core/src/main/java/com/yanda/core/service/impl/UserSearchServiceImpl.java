package com.yanda.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yanda.core.entity.generated.UserSearchInfo;
import com.yanda.core.entity.generated.UserSearchInfoExample;
import com.yanda.core.mapper.generated.UserSearchInfoMapper;
import com.yanda.core.service.UserSearchService;

@Service
public class UserSearchServiceImpl extends BaseServiceImpl<UserSearchInfoMapper, UserSearchInfo, Integer> implements UserSearchService {

	@Override
	public List<UserSearchInfo> queryByUid(int userId) {
		UserSearchInfoExample example = new UserSearchInfoExample();
        example.or().andUserIdEqualTo(userId).andIsDeletedEqualTo(false);
        example.setDistinct(true);
        return this.mapper.selectByExample(example);
	}

	@Override
	public void deleteByUid(int userId) {
		UserSearchInfoExample example = new UserSearchInfoExample();
        example.or().andUserIdEqualTo(userId);
        UserSearchInfo searchHistory = new UserSearchInfo();
        searchHistory.setIsDeleted(true);
        this.mapper.updateByExampleSelective(searchHistory, example);
	}



}
