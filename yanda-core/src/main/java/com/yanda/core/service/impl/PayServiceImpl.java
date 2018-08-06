package com.yanda.core.service.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yanda.core.entity.PageResult;
import com.yanda.core.entity.generated.PayInfo;
import com.yanda.core.entity.generated.PayInfoExample;
import com.yanda.core.mapper.generated.PayInfoMapper;
import com.yanda.core.service.PayService;

@Service
public class PayServiceImpl extends BaseServiceImpl<PayInfoMapper, PayInfo, Long> implements PayService {


	@Override
	public PageResult<PayInfo> list(int pageNum, int pageSize, int userId) {
		Page<PayInfo> pageInfo = PageHelper.startPage(pageNum, pageSize);
		PayInfoExample example = new PayInfoExample();
		example.createCriteria().andUserIdEqualTo(userId);
		example.setOrderByClause("pay_time desc");
		mapper.selectByExample(example);
		PageResult<PayInfo> result = new PageResult<>(pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getResult());
		return result;
	}


	@Override
	public String getPaySign(String str) {
		String md5Str = DigestUtils.md5Hex(str);
		return md5Str;
	}


}
