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
public class Comment extends BaseBean {
	private static final long serialVersionUID = -3718003433102767960L;
	
	private String id; // 自动编号
	private String co_id; // 唯一编号
	private String parent_id; // 回复的上级编号
	private String user_id; // 会员编号
	private String sp_id; // 被评论唯一编号
	private String big_id; // 栏目级别
	private String title; // 评论标题
	private String body; // 评论内容
	private String sequence; // 排序
	private String b_date; // 评论日期
	private String u_flag; // 管理状态
	private String groupid; // 分站编号
	private String lang_id; // 语言编号
	private String admin_id; // 管理id
	private String parent_userid; //回复用户编号
	private int level;//当前评论的层级
	
	//虚拟字段
	private String tbody;// 回复内容
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCo_id() {
		return co_id;
	}
	public void setCo_id(String coId) {
		co_id = coId;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parentId) {
		parent_id = parentId;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String userId) {
		user_id = userId;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String spId) {
		sp_id = spId;
	}
	public String getBig_id() {
		return big_id;
	}
	public void setBig_id(String bigId) {
		big_id = bigId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String bDate) {
		b_date = bDate;
	}
	public String getU_flag() {
		return u_flag;
	}
	public void setU_flag(String uFlag) {
		u_flag = uFlag;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getLang_id() {
		return lang_id;
	}
	public void setLang_id(String langId) {
		lang_id = langId;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String adminId) {
		admin_id = adminId;
	}
	public String getParent_userid() {
		return parent_userid;
	}
	public void setParent_userid(String parentUserid) {
		parent_userid = parentUserid;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getTbody() {
		return tbody;
	}
	public void setTbody(String tbody) {
		this.tbody = tbody;
	}
	
}

