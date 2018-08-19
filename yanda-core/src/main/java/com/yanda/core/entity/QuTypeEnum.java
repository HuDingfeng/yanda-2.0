package com.yanda.core.entity;

public enum QuTypeEnum {
	
	ZTLX(1),  //专题练习
	ZSGG(2),  //知识巩固
	LNZT(3),  //历年真题
	FZLX(4);  //仿真练习

	
	public int value;

	private QuTypeEnum(int value) {
		this.value = value;
	}
	
}
