/*
 * @(#) CouponsUser.java 2015-11-3
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;


/**
 * CouponsUser.java
 * @author zhulm 2015-11-3
 * @version 1.0
 */
public class CouponsUser extends BaseBean {
	private static final long serialVersionUID = 2785622675044741383L;
	private String id;
	private String cpid;
	private String uid;
	private String adate;
	private String udate;
	private String flag;
	private String ordid;
	private String orddate;
	private String deladm;
	private String deldate;
	/*
	 * 虚拟
	 */
	private String uname;
	private String deladmname;
	private String isorder;
	private int limit;
	private String oflag;
	private String cptitle;
	private String cpmoney;
	private Coupons cp;
	
	public String getCpmoney() {
		return cpmoney;
	}
	public void setCpmoney(String cpmoney) {
		this.cpmoney = cpmoney;
	}
	public String getCptitle() {
		return cptitle;
	}
	public void setCptitle(String cptitle) {
		this.cptitle = cptitle;
	}
	public Coupons getCp() {
		return cp;
	}
	public void setCp(Coupons cp) {
		this.cp = cp;
	}
	public String getOflag() {
		return oflag;
	}
	public void setOflag(String oflag) {
		this.oflag = oflag;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getDeladmname() {
		return deladmname;
	}
	public void setDeladmname(String deladmname) {
		this.deladmname = deladmname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCpid() {
		return cpid;
	}
	public void setCpid(String cpid) {
		this.cpid = cpid;
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
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getOrdid() {
		return ordid;
	}
	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}
	public String getOrddate() {
		return orddate;
	}
	public void setOrddate(String orddate) {
		this.orddate = orddate;
	}
	public String getDeladm() {
		return deladm;
	}
	public void setDeladm(String deladm) {
		this.deladm = deladm;
	}
	public String getDeldate() {
		return deldate;
	}
	public void setDeldate(String deldate) {
		this.deldate = deldate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

