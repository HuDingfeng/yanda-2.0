package com.yanda.core.service;

import java.util.List;

import com.yanda.core.entity.generated.UserSearchInfo;

public interface UserSearchService extends BaseService<UserSearchInfo, Integer> {
	
	public List<UserSearchInfo> queryByUid(int userId);

    public void deleteByUid(int userId);
}
