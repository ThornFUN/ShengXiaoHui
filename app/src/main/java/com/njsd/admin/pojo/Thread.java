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
public class Thread extends BaseBean {
	private static final long serialVersionUID = -3718003433102767960L;
	
	private String id; // 自动编号
	
	private String bid; // 版块ID
	private String name; // 版块名字
	private String img; // 图片
	private String content; // 内容
	private String uid; // 版主
	
	private String alltop; // 全部置顶
	private String boardtop; // 版块置顶
	private String thredtop; // 推荐
	private String viewc; // 访问次数
	private String c_date; // 发布时间
	private String status; // 状态
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAlltop() {
		return alltop;
	}
	public void setAlltop(String alltop) {
		this.alltop = alltop;
	}
	public String getBoardtop() {
		return boardtop;
	}
	public void setBoardtop(String boardtop) {
		this.boardtop = boardtop;
	}
	public String getThredtop() {
		return thredtop;
	}
	public void setThredtop(String thredtop) {
		this.thredtop = thredtop;
	}
	public String getViewc() {
		return viewc;
	}
	public void setViewc(String viewc) {
		this.viewc = viewc;
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

