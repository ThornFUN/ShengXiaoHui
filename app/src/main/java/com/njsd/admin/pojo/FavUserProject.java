/*
 * @(#) FavUserProject.java 2015-1-19
 * 
 * Copyright 2015© 南京硕德信息技术有限公司, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * FavUserProject.java
 * @author zhulm 2015-1-19
 * @version 1.0
 */
public class FavUserProject extends BaseBean{
	private static final long serialVersionUID = -6015751385655371086L;
	private String id;
	private String uid;
	private String pid;
	private String adate;
	private String ftype;
	private String type;
	private CsBooks cb;
	
	public CsBooks getCb() {
		return cb;
	}
	public void setCb(CsBooks cb) {
		this.cb = cb;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
}

