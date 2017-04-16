/*
 *	@(#)ShopScore.java
 *	2016-5-16
 *	copyright@2016,all rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 *	ShopScore.java
 *	@author zhulm
 *	@date 2016-5-16
 */
public class ShopScore extends BaseBean {
	private static final long serialVersionUID = 7100259232227493394L;
	private String id;
	private String pid;
	private String uid;
	private String ordid;
	private String score;
	private String adate;
	private String flag;
	private String limit;
	private String uname;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
	public String getOrdid() {
		return ordid;
	}
	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
