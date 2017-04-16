/*
 * @(#) FlMoney.java 2015-9-28
 * 
 * Copyright 2014© 南京硕德信息技术有限公司, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * FlMoney.java
 * @author zhulm
 * @date 2015-9-28
 * @version 1.0
 */

public class FlMoney  extends BaseBean {
	private static final long serialVersionUID = -7116241979100187346L;
	private String id;
	private String mid;
	private String ordid;
	private String uid;
	private String utype;
	private String oconsume;
	private String consume;
	private String num;
	private String rate;
	private String money;
	private String omoney;
	private String nmoney;
	private String mtype;
	private String status;
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
	private String puname;
	private String daterange;
	private String daterangeid;
	private MyOrder ord;
	
	public MyOrder getOrd() {
		return ord;
	}
	public void setOrd(MyOrder ord) {
		this.ord = ord;
	}
	public String getDaterange() {
		return daterange;
	}
	public void setDaterange(String daterange) {
		this.daterange = daterange;
	}
	public String getDaterangeid() {
		return daterangeid;
	}
	public void setDaterangeid(String daterangeid) {
		this.daterangeid = daterangeid;
	}
	public String getPuname() {
		return puname;
	}
	public void setPuname(String puname) {
		this.puname = puname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getOrdid() {
		return ordid;
	}
	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getOconsume() {
		return oconsume;
	}
	public void setOconsume(String oconsume) {
		this.oconsume = oconsume;
	}
	public String getConsume() {
		return consume;
	}
	public void setConsume(String consume) {
		this.consume = consume;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getOmoney() {
		return omoney;
	}
	public void setOmoney(String omoney) {
		this.omoney = omoney;
	}
	public String getNmoney() {
		return nmoney;
	}
	public void setNmoney(String nmoney) {
		this.nmoney = nmoney;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
}
