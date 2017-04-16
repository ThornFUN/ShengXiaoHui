/*
 * @(#) Tender.java 2014-11-12
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * Tender.java
 * @author zhulm 2014-11-12
 * @version 1.0
 */
public class Tender extends BaseBean {
	private static final long serialVersionUID = 7535293194666122832L;
	
	private String id;//自动编号
	private String wk_id;//任务编号
	private String user_id;//会员编号
	private String groupid;//分站编号
	private String lang_id;//语言编号
	private String admin_id;//管理id
	private String td_select;// 是否中标
	private String td_file;//附件        
	private String td_bdate;//投标时间    
	private String td_see;// 雇主是否看稿
	private String td_option;//是否备选    
	private String td_type;//投标类型  
	private String td_price;//投标报价
	private String td_body;//投标详情
	private String u_img;//用户头像
	private String u_grade;//用户等级
	private String u_account;//用户账户
	private String td_filename;//附件名称
	private String commentSize;//评论数量
	private boolean complete;//任务是否完成
	private List<Comment> comments;//评论
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWk_id() {
		return wk_id;
	}
	public void setWk_id(String wkId) {
		wk_id = wkId;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String userId) {
		user_id = userId;
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
	public String getTd_select() {
		return td_select;
	}
	public void setTd_select(String tdSelect) {
		td_select = tdSelect;
	}
	public String getTd_file() {
		return td_file;
	}
	public void setTd_file(String tdFile) {
		td_file = tdFile;
	}
	public String getTd_bdate() {
		return td_bdate;
	}
	public void setTd_bdate(String tdBdate) {
		td_bdate = tdBdate;
	}
	public String getTd_see() {
		return td_see;
	}
	public void setTd_see(String tdSee) {
		td_see = tdSee;
	}
	public String getTd_option() {
		return td_option;
	}
	public void setTd_option(String tdOption) {
		td_option = tdOption;
	}
	public String getTd_type() {
		return td_type;
	}
	public void setTd_type(String tdType) {
		td_type = tdType;
	}
	public String getTd_price() {
		return td_price;
	}
	public void setTd_price(String tdPrice) {
		td_price = tdPrice;
	}
	public String getTd_body() {
		return td_body;
	}
	public void setTd_body(String tdBody) {
		td_body = tdBody;
	}
	public String getU_img() {
		return u_img;
	}
	public void setU_img(String uImg) {
		u_img = uImg;
	}
	public String getU_grade() {
		return u_grade;
	}
	public void setU_grade(String uGrade) {
		u_grade = uGrade;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String uAccount) {
		u_account = uAccount;
	}
	public String getTd_filename() {
		return td_filename;
	}
	public void setTd_filename(String tdFilename) {
		td_filename = tdFilename;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public String getCommentSize() {
		return commentSize;
	}
	public void setCommentSize(String commentSize) {
		this.commentSize = commentSize;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}

}

