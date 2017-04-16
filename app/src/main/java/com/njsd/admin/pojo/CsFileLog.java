/*
 * @(#) CsFileLog.java 2015-7-6
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * CsFileLog.java
 * @author zhulm 2015-7-6
 * @version 1.0
 */
public class CsFileLog extends BaseBean {
	private static final long serialVersionUID = 6845064364992613185L;
	private String id;
	private String pid;
	private String fstatus;
	private String tstatus;
	private String adate;
	private String tips;
	private String outtime;
	private String status;
	/*
	 * 虚拟
	 */
	private String isorder;
	private String limit;
	
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
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
	public String getFstatus() {
		return fstatus;
	}
	public void setFstatus(String fstatus) {
		this.fstatus = fstatus;
	}
	public String getTstatus() {
		return tstatus;
	}
	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

