/*
 * @(#) LicaiInvest.java 2015-4-9
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * LicaiInvest.java
 * @author zhulm
 * @date 2015-4-9
 * @version 1.0
 */

public class CdInvest extends BaseBean {
	private static final long serialVersionUID = 8789565508539059350L;
	private String id;
	private String lcid;//理财编号
	private String uid;//用户编号
	private String num;//购买份数
	private String price;//单价
	private String money;//金额
	private String adate;//购买时间
	private String groupid;
	private String status;//AA61
	private String tips;//备注
	private String aid;//管理id
	private String edate;//结束时间
	/*
	 * 虚拟
	 */
	private String uname;
	private String uimg;
	private String province;
	private String city;
	private String isorder;
	private String title;
	private String utel;
	private String yearrate;//年利率
	private String lcstatus;
	
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
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
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
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUimg() {
		return uimg;
	}
	public void setUimg(String uimg) {
		this.uimg = uimg;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
	public String getYearrate() {
		return yearrate;
	}
	public void setYearrate(String yearrate) {
		this.yearrate = yearrate;
	}
	public String getLcstatus() {
		return lcstatus;
	}
	public void setLcstatus(String lcstatus) {
		this.lcstatus = lcstatus;
	}
}
