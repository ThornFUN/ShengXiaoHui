/*
 * @(#) CdRepay.java 2015-4-16
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * CdRepay.java
 * @author zhulm 2015-4-16
 * @version 1.0
 */
public class CdRepay extends BaseBean {
	private static final long serialVersionUID = -7406396128962455137L;
	private String id;
	private String rpid;//还款计划流水号
	private String lcid;//理财id
	private String invid;//投资id
	private String uid;//被还款用户id
	private String planmoney;//计划还款金额
	private String plandate;//计划还款时间
	private String tips;//备注
	private String rptype;//0-系统自动，1管理手动
	private String status;//还款计划状态AA62
	private String adate;//创建时间
	private String aadm;
	private String udate;//最后修改时间
	private String uadm;
	private String succdate;//执行还款计划时间
	private String succadm;
	private String caldate;//撤销已执行还款计划时间
	private String caladm;
	private String caltips;//撤销备注
	/*
	 * 虚拟
	 */
	private String aadmname;
	private String uadmname;
	private String succadmname;
	private String caladmname;
	private String invstatus;
	private String isorder;
	private String title;
	private String u_account;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRpid() {
		return rpid;
	}
	public void setRpid(String rpid) {
		this.rpid = rpid;
	}
	public String getLcid() {
		return lcid;
	}
	public void setLcid(String lcid) {
		this.lcid = lcid;
	}
	public String getInvid() {
		return invid;
	}
	public void setInvid(String invid) {
		this.invid = invid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPlanmoney() {
		return planmoney;
	}
	public void setPlanmoney(String planmoney) {
		this.planmoney = planmoney;
	}
	public String getPlandate() {
		return plandate;
	}
	public void setPlandate(String plandate) {
		this.plandate = plandate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getSuccdate() {
		return succdate;
	}
	public void setSuccdate(String succdate) {
		this.succdate = succdate;
	}
	public String getSuccadm() {
		return succadm;
	}
	public void setSuccadm(String succadm) {
		this.succadm = succadm;
	}
	public String getCaldate() {
		return caldate;
	}
	public void setCaldate(String caldate) {
		this.caldate = caldate;
	}
	public String getCaladm() {
		return caladm;
	}
	public void setCaladm(String caladm) {
		this.caladm = caladm;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getCaltips() {
		return caltips;
	}
	public void setCaltips(String caltips) {
		this.caltips = caltips;
	}
	public String getAadmname() {
		return aadmname;
	}
	public void setAadmname(String aadmname) {
		this.aadmname = aadmname;
	}
	public String getUadmname() {
		return uadmname;
	}
	public void setUadmname(String uadmname) {
		this.uadmname = uadmname;
	}
	public String getSuccadmname() {
		return succadmname;
	}
	public void setSuccadmname(String succadmname) {
		this.succadmname = succadmname;
	}
	public String getCaladmname() {
		return caladmname;
	}
	public void setCaladmname(String caladmname) {
		this.caladmname = caladmname;
	}
	public String getRptype() {
		return rptype;
	}
	public void setRptype(String rptype) {
		this.rptype = rptype;
	}
	public String getInvstatus() {
		return invstatus;
	}
	public void setInvstatus(String invstatus) {
		this.invstatus = invstatus;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String u_account) {
		this.u_account = u_account;
	}
}

