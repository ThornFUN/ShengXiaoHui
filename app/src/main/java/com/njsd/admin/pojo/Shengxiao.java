/*
 * @(#)Order.java  2014-1-21
 * 
 * Copyright 2015© 铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 生肖实体类
 * 
 * @author xull
 * @version v2.0.0
 */
public class Shengxiao extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String id; //唯一编号
	private String order_id; //商品编号
	private String user_id; //用户编号
	private String admin_id;//上级用户
	private String animal; //生肖
	private String price; //基础金额
	private String shouyi;//利息收益金额
	private String or_flag; //交易类型 0:未付款（上级） 1:待打款（会员）2：已打款 3：成功开通
	private String groupid; //分站编号
	private String or_date; //订单日期
	
	//虚拟
	private String user_name;
	private String puid_name;
	private String shengxiao_name;//生肖
	private String vip_text;//等级
	private double user_money;//用户账户金额
	
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
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	public String getOr_date() {
		return or_date;
	}
	public void setOr_date(String or_date) {
		this.or_date = or_date;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getVip_text() {
		return vip_text;
	}
	public void setVip_text(String vip_text) {
		this.vip_text = vip_text;
	}
	public double getUser_money() {
		return user_money;
	}
	public void setUser_money(double user_money) {
		this.user_money = user_money;
	}
	public String getShouyi() {
		return shouyi;
	}
	public void setShouyi(String shouyi) {
		this.shouyi = shouyi;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getPuid_name() {
		return puid_name;
	}
	public void setPuid_name(String puid_name) {
		this.puid_name = puid_name;
	}
	public String getShengxiao_name() {
		return shengxiao_name;
	}
	public void setShengxiao_name(String shengxiao_name) {
		this.shengxiao_name = shengxiao_name;
	}
}
