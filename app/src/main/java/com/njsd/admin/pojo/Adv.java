/*
 * @(#) Adv.java 2014-11-12
 * 
 * Copyright 2014© 车贷之家, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;


/**
 * Adv.java
 * @author zhulm 2014-11-12
 * @version 1.0
 */
public class Adv extends BaseBean {
	private static final long serialVersionUID = -8567988739217198700L;
	
	private int id; //自动编号
	private String title; //标题
	private int type; //类型
	private String url; //链接地址
	private String pc_url;//PC链接地址
	private String openfs; //打开方式
	private String img; //图片
	private String phone_img;
	private String b_date; //时间
	private String discontent; //说明
	private int width; //宽度
	private int height; //高度
	private String code; //文字内容
	private String note; //备注
	private String show; //展现形式
	private int built; //是否产生html
	private String groupid; //分站编号
	private String admin_id; //管理id
	private String lang_id; //语言编号
	private int sequence; //排序
	
	
	public String getPc_url() {
		return pc_url;
	}
	public void setPc_url(String pc_url) {
		this.pc_url = pc_url;
	}
	public String getPhone_img() {
		return phone_img;
	}
	public void setPhone_img(String phoneImg) {
		phone_img = phoneImg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOpenfs() {
		return openfs;
	}
	public void setOpenfs(String openfs) {
		this.openfs = openfs;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String bDate) {
		b_date = bDate;
	}
	public String getDiscontent() {
		return discontent;
	}
	public void setDiscontent(String discontent) {
		this.discontent = discontent;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}
	public int getBuilt() {
		return built;
	}
	public void setBuilt(int built) {
		this.built = built;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String adminId) {
		admin_id = adminId;
	}
	public String getLang_id() {
		return lang_id;
	}
	public void setLang_id(String langId) {
		lang_id = langId;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
}

