/*
 * @(#) Member.java 2014-11-12
 * 
 * Copyright 2015© 南京硕德信息技术有限公司, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 会员学习记录
 * @author wangjie
 * @version 1.0
 */
public class StudyRecord extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String id; // 自动编号
	private String user_id;// 唯一编号
	private String study_id;//学习文字ID 
	private String a_date;//日期
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getStudy_id() {
		return study_id;
	}
	public void setStudy_id(String study_id) {
		this.study_id = study_id;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String a_date) {
		this.a_date = a_date;
	}
	
}

