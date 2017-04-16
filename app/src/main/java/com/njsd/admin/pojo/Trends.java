/*
 * @(#) Trends.java 2015-1-29
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Trends.java
 * @author zhulm 2015-1-29
 * @version 1.0
 */
public class Trends extends BaseBean {
	private static final long serialVersionUID = 1884963095284178248L;
	
	private String id;
	private String tid;//动态id
	private String pid;//项目id
	private String f_state;//项目动态之前，项目状态
	private String t_state;//项目动态之后，项目状态
	private String title;//动态标题
	private String date;
	private String body;//动态报告
	private String uid;//用户id
	private String aid;//管理id
	private String type;//0-系统；1-会员；2-管理员
	
	private Member u;
	private Admin a;
	private String uname;
	private String aname;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getF_state() {
		return f_state;
	}
	public void setF_state(String fState) {
		f_state = fState;
	}
	public String getT_state() {
		return t_state;
	}
	public void setT_state(String tState) {
		t_state = tState;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Member getU() {
		return u;
	}
	public void setU(Member u) {
		this.u = u;
	}
	public Admin getA() {
		return a;
	}
	public void setA(Admin a) {
		this.a = a;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
}

