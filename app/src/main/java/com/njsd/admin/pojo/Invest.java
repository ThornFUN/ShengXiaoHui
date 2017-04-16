/*
 * @(#) Invest.java 2014-12-23
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 投资
 * Invest.java
 * @author zhulm 2014-12-23
 * @version 1.0
 */
public class Invest extends BaseBean{
	private static final long serialVersionUID = -8615455258235102693L;
	
	private String id;
	private String l_id;
	private String investorid;
	private String inv_date;
	private String money;
	private String groupid;
	private String remark;
	private String status;
	private String a_id;
	private String a_date;
	private String reason;
	private String pack_id;
	
	/*虚拟*/
	private String u_account;
	private String u_img;
	private String province;
	private String city;
	private String content;
	private String content1;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getL_id() {
		return l_id;
	}
	public void setL_id(String lId) {
		l_id = lId;
	}
	public String getInvestorid() {
		return investorid;
	}
	public void setInvestorid(String investorid) {
		this.investorid = investorid;
	}
	public String getInv_date() {
		return inv_date;
	}
	public void setInv_date(String invDate) {
		inv_date = invDate;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String aId) {
		a_id = aId;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String aDate) {
		a_date = aDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String uAccount) {
		u_account = uAccount;
	}
	public String getU_img() {
		return u_img;
	}
	public void setU_img(String uImg) {
		u_img = uImg;
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
	public String getPack_id() {
		return pack_id;
	}
	public void setPack_id(String pack_id) {
		this.pack_id = pack_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
}

