/*
 * @(#) CsFile.java 2015-7-6
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * CsFile.java
 * @author zhulm 2015-7-6
 * @version 1.0
 */
public class CsFile extends BaseBean {
	private static final long serialVersionUID = 1019348317435689018L;
	private String id;
	private String uuid;
	private String pid;
	private String uid;
	private String sfname;
	private String sfsrc;
	private String sfsize;
	private String suffix;
	private String sffrom;
	private String adate;
	private String status;
	private String udate;
	private String pdfsrc;
	private String topdftime;
	private String pdfsize;
	private String pdfdate;
	private String swfsrc;
	private String swfpage;
	private String toswftime;
	private String swfsize;
	private String swfdate;
	private String bechange;
	/*
	 * 虚拟
	 */
	private String isDown;
	private String downnum;
	private String udownnum;
	private List<CsFileLog> cfls;
	private String isorder;
	private String limit;
	private String isExist;
	private CsBooks cb;
	
	public CsBooks getCb() {
		return cb;
	}
	public void setCb(CsBooks cb) {
		this.cb = cb;
	}
	public String getUdownnum() {
		return udownnum;
	}
	public void setUdownnum(String udownnum) {
		this.udownnum = udownnum;
	}
	public String getIsDown() {
		return isDown;
	}
	public void setIsDown(String isDown) {
		this.isDown = isDown;
	}
	public String getIsExist() {
		return isExist;
	}
	public void setIsExist(String isExist) {
		this.isExist = isExist;
	}
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
	public List<CsFileLog> getCfls() {
		return cfls;
	}
	public void setCfls(List<CsFileLog> cfls) {
		this.cfls = cfls;
	}
	public String getBechange() {
		return bechange;
	}
	public void setBechange(String bechange) {
		this.bechange = bechange;
	}
	public String getDownnum() {
		return downnum;
	}
	public void setDownnum(String downnum) {
		this.downnum = downnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSfsrc() {
		return sfsrc;
	}
	public void setSfsrc(String sfsrc) {
		this.sfsrc = sfsrc;
	}
	public String getSfsize() {
		return sfsize;
	}
	public void setSfsize(String sfsize) {
		this.sfsize = sfsize;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getSffrom() {
		return sffrom;
	}
	public void setSffrom(String sffrom) {
		this.sffrom = sffrom;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getPdfsrc() {
		return pdfsrc;
	}
	public void setPdfsrc(String pdfsrc) {
		this.pdfsrc = pdfsrc;
	}
	public String getTopdftime() {
		return topdftime;
	}
	public void setTopdftime(String topdftime) {
		this.topdftime = topdftime;
	}
	public String getPdfsize() {
		return pdfsize;
	}
	public void setPdfsize(String pdfsize) {
		this.pdfsize = pdfsize;
	}
	public String getPdfdate() {
		return pdfdate;
	}
	public void setPdfdate(String pdfdate) {
		this.pdfdate = pdfdate;
	}
	public String getSwfsrc() {
		return swfsrc;
	}
	public void setSwfsrc(String swfsrc) {
		this.swfsrc = swfsrc;
	}
	public String getSwfpage() {
		return swfpage;
	}
	public void setSwfpage(String swfpage) {
		this.swfpage = swfpage;
	}
	public String getToswftime() {
		return toswftime;
	}
	public void setToswftime(String toswftime) {
		this.toswftime = toswftime;
	}
	public String getSwfsize() {
		return swfsize;
	}
	public void setSwfsize(String swfsize) {
		this.swfsize = swfsize;
	}
	public String getSwfdate() {
		return swfdate;
	}
	public void setSwfdate(String swfdate) {
		this.swfdate = swfdate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

