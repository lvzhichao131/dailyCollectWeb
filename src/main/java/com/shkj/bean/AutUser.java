package com.shkj.bean;

import lombok.Data;

@Data
public class AutUser {
	private String user_id;//
	private String user_name;//
	private String hail_openid;//
	private String org_code;
	private String org_fname;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getHail_openid() {
		return hail_openid;
	}
	public void setHail_openid(String hail_openid) {
		this.hail_openid = hail_openid;
	}
	public String getOrg_code() {
		return org_code;
	}
	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}
	public String getOrg_fname() {
		return org_fname;
	}
	public void setOrg_fname(String org_fname) {
		this.org_fname = org_fname;
	}
	
	
	
	
	
	
}
