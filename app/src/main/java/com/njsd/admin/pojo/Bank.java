/*
 * @(#)Order.java  2014-1-21
 * 
 * Copyright 2015© 南京硕德信息技术有限公司, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 订单管理实体类
 * 
 * @author xull
 * @version v2.0.0
 */
public class Bank extends BaseBean {

	private static final long serialVersionUID = 4850385861713731784L;
	
	private String id; //唯一编号
	private String user_id; //用户编号
	private String b_id; //银行卡号
	private String provinceid; //省
	private String cityid; //市
	private String b_name; //银行名称
	private String b_child; //开户银行支行名称
	private String pay;//银行卡绑定状态0-未绑定1-绑定2-审核中3-审核失败
	private String adate;//修改时间
	private String qita;//其他银行
	private String phone;//其他银行

	/**虚拟字段**/
	private String verify;//排序条件
	private String wei;//尾号
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getB_id() {
		return b_id;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public String getProvinceid() {
		return provinceid;
	}

	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}

	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_child() {
		return b_child;
	}

	public void setB_child(String b_child) {
		this.b_child = b_child;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	public String getWei() {
		return wei;
	}

	public void setWei(String wei) {
		this.wei = wei;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		this.adate = adate;
	}

	public String getQita() {
		return qita;
	}

	public void setQita(String qita) {
		this.qita = qita;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
