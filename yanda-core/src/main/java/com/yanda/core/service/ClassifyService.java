package com.yanda.core.service;

import java.util.List;

import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.WebClassifyInfo;
import com.yanda.core.entity.generated.ClassifyInfo;

public interface ClassifyService extends BaseService<ClassifyInfo, Integer> {
	
	/**
	 * 获取一级分类列表数据
	 * @param pageNum
	 * @param pageSize
	 * @param searchVal 
	 * @return
	 */
    PageResult<ClassifyInfo> list(int pageNum, int pageSize, Integer classifyType, String searchVal);
    
    /**
	 * 获取二级分类列表数据
	 * @param pageNum
	 * @param pageSize
	 * @param parentId
	 * @param searchVal 轮播图描述 用于搜索
	 * @return
	 */
    PageResult<ClassifyInfo> getClassifyById(int pageNum, int pageSize, Integer parentId, Integer classifyType, String searchVal);

    /**
     * 根据type获取分类树
     * @param type
     * @return
     */
	List<WebClassifyInfo> findTreeByType(Integer type);
	
	/**
	 * 根据type获取分类列表
	 * @param type
	 * @return
	 */
	List<WebClassifyInfo> findListByType(Integer type);
	
	/**
	 * 根据parentId获取子分类列表
	 * @param type
	 * @return
	 */
	List<WebClassifyInfo> findChildListByParentId(Integer parentId);

}
