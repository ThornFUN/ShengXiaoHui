/*
 * @(#) LicaiImgs.java 2015-4-2
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * LicaiImgs.java
 * @author zhulm
 * @date 2015-4-2
 * @version 1.0
 */

public class LicaiImgs extends BaseBean {
	private static final long serialVersionUID = -3450273378449558840L;
	private String id;
	private String lcid;
	private String tips;
	private String img;
	private String adate;
	private String udate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLcid() {
		return lcid;
	}
	public void setLcid(String lcid) {
		this.lcid = lcid;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
}
