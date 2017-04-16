/*
 * @(#) UserLoan.java 2015-3-30
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Ma.java
 * @author chuyao 2015-7-02
 * @version 1.0
 */
public class Ma extends BaseBean {
	private static final long serialVersionUID = 4074409267671092146L;
	
	private String id;//id
	private String sp_id;//sp_id
	private String fangweima;//fangweima
	private String erweima;//erweima
	private String fid;//fid
	private String r_id;//r_id
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
	public String getFangweima() {
		return fangweima;
	}
	public void setFangweima(String fangweima) {
		this.fangweima = fangweima;
	}
	public String getErweima() {
		return erweima;
	}
	public void setErweima(String erweima) {
		this.erweima = erweima;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
}

