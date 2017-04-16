/*
 * @(#) CsBooks.java 2015-7-6
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * CsCredit.java
 * @author zhulm 2015-7-6
 * @version 1.0
 */
public class Credit extends BaseBean {
	
	private static final long serialVersionUID = -293808264262118169L;
	private String id;
	private String cid;
	private String pid;
	private String uid;
	private String credit;
	private String ocredit;
	private String ncredit;
	private String ctype;
	private String status;
	private String cfrom;
	private String tips;
	private String aadm;
	private String adate;
	private String cadm;
	private String cdate;
	/*
	 * 虚拟
	 */
	private String isorder;
	private String limit;
	private String uname;
	private String aadmname;
	private String cadmname;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getOcredit() {
		return ocredit;
	}
	public void setOcredit(String ocredit) {
		this.ocredit = ocredit;
	}
	public String getNcredit() {
		return ncredit;
	}
	public void setNcredit(String ncredit) {
		this.ncredit = ncredit;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCfrom() {
		return cfrom;
	}
	public void setCfrom(String cfrom) {
		this.cfrom = cfrom;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getAadm() {
		return aadm;
	}
	public void setAadm(String aadm) {
		this.aadm = aadm;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getCadm() {
		return cadm;
	}
	public void setCadm(String cadm) {
		this.cadm = cadm;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAadmname() {
		return aadmname;
	}
	public void setAadmname(String aadmname) {
		this.aadmname = aadmname;
	}
	public String getCadmname() {
		return cadmname;
	}
	public void setCadmname(String cadmname) {
		this.cadmname = cadmname;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
}

