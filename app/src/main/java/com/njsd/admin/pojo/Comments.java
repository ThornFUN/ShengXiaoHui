/*
 * @(#) Comment.java 2014-11-12
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Comment.java
 * @author zhulm 2014-11-12
 * @version 1.0
 */
public class Comments extends BaseBean {
	private static final long serialVersionUID = -3718003433102767960L;
	
	private String id; // 自动编号
	private String tid; // 帖子编号
	private String uid; // 回帖人
	private String content; // 内容
	private String c_date; // 发布时间
	private String status; // 状态
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getC_date() {
		return c_date;
	}
	public void setC_date(String c_date) {
		this.c_date = c_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

