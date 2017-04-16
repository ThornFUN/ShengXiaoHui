/*
 * @(#) FtFileDownload.java 2015-6-10
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * FtFileDownload.java
 * @author zhulm 2015-6-10
 * @version 1.0
 */
public class FtFileDownload extends BaseBean {
	private static final long serialVersionUID = 2211467844308127512L;
	private String id;
	private String pid;
	private String uid;
	private String adate;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
}

