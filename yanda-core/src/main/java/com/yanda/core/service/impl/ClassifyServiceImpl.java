package com.yanda.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.WebClassifyInfo;
import com.yanda.core.entity.generated.ClassifyInfo;
import com.yanda.core.entity.generated.ClassifyInfoExample;
import com.yanda.core.entity.generated.MovieInfoExample;
import com.yanda.core.exception.DOPException;
import com.yanda.core.mapper.generated.ClassifyInfoMapper;
import com.yanda.core.mapper.generated.MovieInfoMapper;
import com.yanda.core.service.ClassifyService;

@Service
public class ClassifyServiceImpl extends BaseServiceImpl<ClassifyInfoMapper, ClassifyInfo, Integer> implements ClassifyService {
	
	@Autowired
	private MovieInfoMapper movieInfoMapper;
	
	@Cacheable(value = "classifyList")
	@Override
	public PageResult<ClassifyInfo> list(int pageNum, int pageSize, Integer classifyType, String searchVal) {						
		
		Page<ClassifyInfo> pageInfo = PageHelper.startPage(pageNum, pageSize);
		ClassifyInfoExample example = new ClassifyInfoExample();
		example.createCriteria().andClassifyTypeEqualTo(classifyType).andClassifyNameLike("%" + searchVal + "%").andParentIdEqualTo(0);
		example.setOrderByClause("classify_order asc");
		this.mapper.selectByExample(example);
		PageResult<ClassifyInfo> pageResult = new PageResult<>();
		pageResult.setList(pageInfo.getResult());
		pageResult.setTotal(pageInfo.getTotal());
		return pageResult;
	}
	
	@Cacheable(value = "classifyList")
	@Override
	public PageResult<ClassifyInfo> getClassifyById(int pageNum, int pageSize, Integer parentId, Integer classifyType, String searchVal) {
		Page<ClassifyInfo> pageInfo = PageHelper.startPage(pageNum, pageSize);
		ClassifyInfoExample example = new ClassifyInfoExample();
		example.createCriteria().andClassifyNameLike("%" + searchVal + "%").andParentIdEqualTo(parentId).andClassifyTypeEqualTo(classifyType);
		example.setOrderByClause("classify_order asc");
		this.mapper.selectByExample(example);
		PageResult<ClassifyInfo> pageResult = new PageResult<>();
		pageResult.setList(pageInfo.getResult());
		pageResult.setTotal(pageInfo.getTotal());
		return pageResult;
	}
	
	@CacheEvict(value = {"classifyList"}, allEntries=true, beforeInvocation=true)
	@Override
	public int deleteById(Integer id) throws DOPException {
		ClassifyInfoExample example = new ClassifyInfoExample();
		example.createCriteria().andParentIdEqualTo(id);
		int childCount = this.mapper.selectCountByExample(example);
		if (childCount > 0)
			throw new DOPException("请先删除子分类");
		ClassifyInfo classifyInfo = this.mapper.selectByPrimaryKeySelective(id, ClassifyInfo.Col.classifyType);
		
		if (classifyInfo.getClassifyType().intValue() == 1) {
			MovieInfoExample example1 = new MovieInfoExample();
			example1.createCriteria().andClassifyIdEqualTo(id);
			int count = movieInfoMapper.selectCountByExample(example1);
			if (count > 0) {
				throw new DOPException("该分类下存在视频。不能删除该分类");
			}
		}
		
		return super.deleteById(id);
	}

	@Override
	public List<WebClassifyInfo> findTreeByType(Integer type) {
		// 先查询年级分类
		List<WebClassifyInfo> njWebClsList = findListByType(2);
		// 查询年级分类下对应的题目分类
		for (WebClassifyInfo webCls : njWebClsList) {
			ClassifyInfoExample example = new ClassifyInfoExample();
			example.createCriteria().andClassifyTypeEqualTo(type).andParentIdEqualTo(webCls.getId());
			List<ClassifyInfo> clsList = this.mapper.selectByExampleSelective(example, ClassifyInfo.Col.classifyId, ClassifyInfo.Col.classifyName);	
			List<WebClassifyInfo> webClsList = classifyInfoListConvert(clsList);
			webCls.setClassify(webClsList);
			// 章分类需要继续查询节分类
			if (type.intValue() == 3) {
				for (WebClassifyInfo web : webClsList) {
					example.clear();
					example.createCriteria().andParentIdEqualTo(web.getId());
					List<ClassifyInfo> jieClsList = this.mapper.selectByExampleSelective(example, ClassifyInfo.Col.classifyId, ClassifyInfo.Col.classifyName);	
					List<WebClassifyInfo> jieWebClsList = classifyInfoListConvert(jieClsList);
					web.setClassify(jieWebClsList);
				}
			}
		}
		return njWebClsList;
	}
	
	/**
	 * ClassifyInfo 转  WebClassifyInfo
	 * @param clsList
	 * @return
	 */
	private List<WebClassifyInfo> classifyInfoListConvert(List<ClassifyInfo> clsList) {
		List<WebClassifyInfo> webClsInfos = new ArrayList<>();
		for (ClassifyInfo cls : clsList) {
			WebClassifyInfo webCls = new WebClassifyInfo();
			webCls.setId(cls.getClassifyId());
			webCls.setLabel(cls.getClassifyName());
			webCls.setIconUrl(cls.getIconUrl());
			webClsInfos.add(webCls);
		}
		return webClsInfos;
	}

	@Override
	public List<WebClassifyInfo> findListByType(Integer type) {
		ClassifyInfoExample example = new ClassifyInfoExample();
		example.createCriteria().andClassifyTypeEqualTo(type).andParentIdEqualTo(0);
		List<ClassifyInfo> clsList = this.mapper.selectByExampleSelective(example, ClassifyInfo.Col.classifyId, ClassifyInfo.Col.classifyName, ClassifyInfo.Col.iconUrl);
		return classifyInfoListConvert(clsList);
	}

	@Override
	public List<WebClassifyInfo> findChildListByParentId(Integer parentId) {
		ClassifyInfoExample example = new ClassifyInfoExample();
		example.createCriteria().andParentIdEqualTo(parentId);
		List<ClassifyInfo> clsList = this.mapper.selectByExampleSelective(example, ClassifyInfo.Col.classifyId, ClassifyInfo.Col.classifyName, ClassifyInfo.Col.iconUrl);
		return classifyInfoListConvert(clsList);
	}
	
	
}
