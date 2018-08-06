package com.yanda.core.service;

import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.AttachmentInfo;
import com.yanda.core.entity.generated.PaperInfo;
import com.yanda.core.exception.DOPException;

public interface PaperService extends BaseService<PaperInfo, Integer> {
	
	/**
	 * 新增实体
	 * @param t
	 * @return
	 */
	public int save(PaperInfo paper, AttachmentInfo attch) throws DOPException;
	
	
	PageResult<PaperInfo> getList(int pageNum, int pageSize, String searchVal, Integer paperType);

}
