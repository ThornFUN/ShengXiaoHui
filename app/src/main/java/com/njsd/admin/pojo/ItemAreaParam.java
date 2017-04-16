/*
 * @(#) ItemAreaParam.java 2015-3-11
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * ItemAreaParam.java
 * @author zhulm 2015-3-11
 * @version 1.0
 */
public class ItemAreaParam  extends BaseBean {
	private static final long serialVersionUID = 3204236275252573546L;
	
	private String id;
	private String pid;//省id
	private String pname;//
	private String cid;//市id
	private String cname;//
	private String adate;
	private String aadm;
	private String aname;
	private String udate;
	private String uadm;
	private String uname;
	private String ddate;
	private String dadm;
	private String dname;
	private String isdel;
	
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
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getAadm() {
		return aadm;
	}
	public void setAadm(String aadm) {
		this.aadm = aadm;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getUadm() {
		return uadm;
	}
	public void setUadm(String uadm) {
		this.uadm = uadm;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getDdate() {
		return ddate;
	}
	public void setDdate(String ddate) {
		this.ddate = ddate;
	}
	public String getDadm() {
		return dadm;
	}
	public void setDadm(String dadm) {
		this.dadm = dadm;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getIsdel() {
		return isdel;
	}
	public void setIsdel(String isdel) {
		this.isdel = isdel;
	}
}

