/*
 * @(#)Order.java  2014-1-21
 * 
 * Copyright 2015© 铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 订单管理实体类
 * 
 * @author xull
 * @version v2.0.0
 */
public class Order extends BaseBean {

	private static final long serialVersionUID = 4850385861713731784L;
	
	private String id; //唯一编号
	private String order_id; //商品编号
	private String admin_id; //用户编号
	private String price; //交易金额
	private String or_flag; //交易类型 0:充值 1:提现 2：扣除
	private String groupid; //分站编号
	private String lang_id; //语言编号
	private String or_date; //订单日期
	private String total;//商品总价
	private String b_id;//银行卡号
	private String bank;//支付详情
	private String phone;//手机号码
	private String payStatus;//订单状态
	private String remarks;//备注
	private String uname;//名字
	private String payway;
	private String paynum;

	/**虚拟字段**/
	private String isorder;//排序条件

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOr_flag() {
		return or_flag;
	}

	public void setOr_flag(String or_flag) {
		this.or_flag = or_flag;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getLang_id() {
		return lang_id;
	}

	public void setLang_id(String lang_id) {
		this.lang_id = lang_id;
	}

	public String getOr_date() {
		return or_date;
	}

	public void setOr_date(String or_date) {
		this.or_date = or_date;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getB_id() {
		return b_id;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getIsorder() {
		return isorder;
	}

	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPayway() {
		return payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public String getPaynum() {
		return paynum;
	}

	public void setPaynum(String paynum) {
		this.paynum = paynum;
	}
}
