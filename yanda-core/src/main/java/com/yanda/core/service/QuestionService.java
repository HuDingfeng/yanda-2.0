package com.yanda.core.service;

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
}
