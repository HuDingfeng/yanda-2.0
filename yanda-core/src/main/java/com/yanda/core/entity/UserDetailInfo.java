package com.yanda.core.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yanda.core.entity.generated.RoleInfo;
import com.yanda.core.entity.generated.UserInfo;
import com.yanda.core.entity.generated.VipCardInfo;

public class UserDetailInfo extends UserInfo {

	
	private static final long serialVersionUID = 2596516089919551490L;
	
	/**
	 * 用户角色
	 */
	private List<RoleInfo> role;
	
	/**
	 * 用户绑定的会员卡
	 */
	private VipCardInfo vipCard;
	
	/**
	 * 覆盖账号密码，不返回前台
	 */
	@JsonIgnore
	private String password;

	

	public List<RoleInfo> getRole() {
		return role;
	}



	public void setRole(List<RoleInfo> role) {
		this.role = role;
	}

	

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	


	public VipCardInfo getVipCard() {
		return vipCard;
	}



	public void setVipCard(VipCardInfo vipCard) {
		this.vipCard = vipCard;
	}



	public UserDetailInfo() {
		super();
	}

	
}
