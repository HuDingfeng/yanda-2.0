package com.yanda.core.service;

import java.util.List;

import com.yanda.core.entity.generated.ProductInfo;

public interface ProductService extends BaseService<ProductInfo, Integer> {
	
	List<ProductInfo> findAll();
	
}
