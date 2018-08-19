package com.yanda.core.service;

import java.util.List;

import com.yanda.core.entity.generated.AttachmentInfo;
import com.yanda.core.entity.generated.QuestionInfo;
import com.yanda.core.exception.DOPException;

public interface QuestionService extends BaseService<QuestionInfo, Long> {
	
	public int save(QuestionInfo t, AttachmentInfo imgAttach, AttachmentInfo videoAttach) throws DOPException;
	
	/**
     * 修改实体
     * @param record
     * @return
     */
    public int update(QuestionInfo t, AttachmentInfo imgAttach, AttachmentInfo videoAttach) throws DOPException;
    
    /**
     * 根据题目的类型和分类id获取题目列表
     * @param id
     * @param module
     * @return
     */
    public List<QuestionInfo> list(Integer id, Integer module);
    
    /**
     * 根据题目的类型和分类id获取题目总数
     * @param id
     * @param module
     * @return
     */
    public Integer getTotal(Integer id, Integer module);
}
