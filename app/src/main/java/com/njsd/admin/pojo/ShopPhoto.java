/*
 * @(#)ShopPhoto.java  2014-1-9
 * 
 * Copyright 2015© 北京铸信至诚科技有限公司, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 商品相册
 * 
 * @author xull
 * @version v2.0.0
 */
public class ShopPhoto extends BaseBean {

	private static final long serialVersionUID = -7607951152952070673L;

	private String id;// 唯一编号
	private String sp_id;// 商品编号
	private String sp_img;// 商品图片
	private String sp_date;// 插入时间
	private String groupid;// 分站编号
	private String lang_id;// 语言编号
	private String admin_id;// 会员编号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSp_id() {
		return sp_id;
	}

	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}

	public String getSp_img() {
		return sp_img;
	}

	public void setSp_img(String sp_img) {
		this.sp_img = sp_img;
	}

	public String getSp_date() {
		return sp_date;
	}

	public void setSp_date(String sp_date) {
		this.sp_date = sp_date;
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

	public void setLang_id(String lang_id) {
		this.lang_id = lang_id;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
}
