package com.yanda.core.entity;

public enum ClsTypeEnum {
	
	MOVIE(10),  		//视频分类
	KAOTI(20), 			//考题分类
	ZTLXZ(21), 			//专题练习章
	ZTLXJ(211),   		//专题练习节 
	ZSGGZ(22),  		//知识巩固章
	ZSGGJ(221), 		//知识巩固节
	LNZT(23), 			//历年真题 
	FZLX(24);			//仿真练习
	
	public int value;

	private ClsTypeEnum(int value) {
		this.value = value;
	}
	
}
