/*
 * @(#) LicaiCheck.java 2015-4-2
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * LicaiCheck.java
 * @author zhulm
 * @date 2015-4-2
 * @version 1.0
 */

public class LicaiCheck extends BaseBean {
	private static final long serialVersionUID = 6066274299142553352L;
	private String id;
	private String lcid;
	private String tips;
	private String adate;
	private String chkdate;
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
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getChkdate() {
		return chkdate;
	}
	public void setChkdate(String chkdate) {
		this.chkdate = chkdate;
	}
}
