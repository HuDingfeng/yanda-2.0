package com.yanda.core.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.QuTypeEnum;
import com.yanda.core.entity.generated.AttachmentInfo;
import com.yanda.core.entity.generated.QuestionInfo;
import com.yanda.core.entity.generated.QuestionInfoExample;
import com.yanda.core.exception.DOPException;
import com.yanda.core.mapper.CustomMapper;
import com.yanda.core.mapper.generated.QuestionInfoMapper;
import com.yanda.core.service.AttachmentService;
import com.yanda.core.service.QuestionService;

@Service
public class QuestionServiceImpl extends BaseServiceImpl<QuestionInfoMapper, QuestionInfo, Long> implements QuestionService {
	
	@Autowired
	private AttachmentService attachmentService;
	@Autowired
	private CustomMapper customMapper;
	
	@Override
	public PageResult<QuestionInfo> getList(int pageNum, int pageSize, String searchVal) {
		Page<QuestionInfo> pageInfo = PageHelper.startPage(pageNum, pageSize);
		
		QuestionInfoExample example = new QuestionInfoExample();
		example.or().andQuestionNameLike("%" + searchVal + "%");
		example.or().andQuestionContentLike("%" + searchVal + "%");
		example.setOrderByClause("update_time desc");
		mapper.selectByExample(example);
		
		PageResult<QuestionInfo> pageResult = new PageResult<>(pageInfo.getTotal(), pageInfo.getPages(),
				pageInfo.getPageSize(), pageInfo.getResult());
		return pageResult;
		
	}
	
	@Transactional
	@Override
	public int deleteById(Long id) throws DOPException {
		QuestionInfo qInfo = this.mapper.selectByPrimaryKey(id);
		if (qInfo.getImgAppendixId() != null) {
			attachmentService.deleteById(qInfo.getImgAppendixId());
		}
		if (qInfo.getMvAppendixId() != null) {
			attachmentService.deleteById(qInfo.getMvAppendixId());
		}
		return super.deleteById(id);
	}
	
	@Transactional
	@Override
	public int save(QuestionInfo t, AttachmentInfo imgAttach, AttachmentInfo videoAttach) throws DOPException {
		if (null != imgAttach) {
			attachmentService.save(imgAttach);
			t.setImgAppendixId(imgAttach.getAppendixId());
		}
		if (null != videoAttach) {
			attachmentService.save(videoAttach);
			t.setMvAppendixId(videoAttach.getAppendixId());
		}
		return super.save(t);
	}
	
	@Transactional
	@Override
	public int update(QuestionInfo t, AttachmentInfo imgAttach, AttachmentInfo videoAttach) throws DOPException {
		if (null != imgAttach) {
			attachmentService.save(imgAttach);
			t.setImgAppendixId(imgAttach.getAppendixId());
		}
		if (null != videoAttach) {
			attachmentService.save(videoAttach);
			t.setMvAppendixId(videoAttach.getAppendixId());
		}
		return super.update(t);
	}

	@Override
	public List<QuestionInfo> list(Integer id, Integer module) {
		QuestionInfoExample example = new QuestionInfoExample();
		return excuteSelect(example, id, module);
	}
	
	private List<QuestionInfo> excuteSelect(QuestionInfoExample example, Integer id, Integer module) {
		if (module.intValue() == QuTypeEnum.ZTLX.value || module.intValue() == QuTypeEnum.ZSGG.value) {
			example.createCriteria().andClassify3EqualTo(id);
			List<QuestionInfo> qInfos = mapper.selectByExample(example);
			Collections.shuffle(qInfos);
			// 章节练习或专业知识练习纸只获取十条题目
			//customMapper.findRandQuestions(id);
			return qInfos;
		} else if (module.intValue() == QuTypeEnum.LNZT.value || module.intValue() == QuTypeEnum.FZLX.value) {
			example.createCriteria().andClassify2EqualTo(id);
		}
		return mapper.selectByExample(example);
		
	}

	@Override
	public Integer getTotal(Integer id, Integer module) {
		QuestionInfoExample example = new QuestionInfoExample();
		example.createCriteria().andClassify3EqualTo(id);
		return this.mapper.selectCountByExample(example);
	}
	
}
