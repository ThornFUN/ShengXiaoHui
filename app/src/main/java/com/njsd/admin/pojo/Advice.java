/*
 * @(#) Advice.java 2014-12-23
 * 
 * Copyright 2014© 南京硕德信息技术有限公司, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 投诉建议
 * Advice.java
 * @author zhulm 2014-12-23
 * @version 1.0
 */
public class Advice extends BaseBean {
	private static final long serialVersionUID = 9096311510585933548L;
	
	private String id;
	private String user_id;
	private String user_name;
	private String tel;
	private String e_mail;
	private String msg;
	private String a_date;
	private String groupid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String userId) {
		user_id = userId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String userName) {
		user_name = userName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String eMail) {
		e_mail = eMail;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String aDate) {
		a_date = aDate;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
}

