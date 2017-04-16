/*
 * @(#)Param.java  2013-9-8
 * 
 * 智能平台管理系统.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * 
 * @author xull
 * @version v2.0.0
 */
public class Activity extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String id; // 自动编号
	private String sp_id; // 商品id
	private String name; // 名称
	private String fid; // 父id
	private String sp_title; // 商品name
	private String sp_mprice; // 商品money
	private String sp_simg; // 商品img
	
	public String getSp_mprice() {
		return sp_mprice;
	}
	public void setSp_mprice(String sp_mprice) {
		this.sp_mprice = sp_mprice;
	}
	public String getSp_simg() {
		return sp_simg;
	}
	public void setSp_simg(String sp_simg) {
		this.sp_simg = sp_simg;
	}
	public String getSp_title() {
		return sp_title;
	}
	public void setSp_title(String sp_title) {
		this.sp_title = sp_title;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
}
