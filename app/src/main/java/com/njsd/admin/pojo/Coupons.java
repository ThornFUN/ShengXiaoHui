/*
 * @(#) Coupons.java 2015-10-15
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Coupons.java
 * @author zhulm 2015-10-15
 * @version 1.0
 */
public class Coupons extends BaseBean {
	private static final long serialVersionUID = 7083888018731043941L;
	private String id;
	private String cpid;
	private String title;
	private String money;
	private String get_limit_way;
	private String get_limit_money;
	private String use_limit_way;
	private String use_limit_money;
	private String tips;
	private String flag;
	private String adate;
	private String aadm;
	private String udate;
	private String uadm;
	/*
	 *虚拟 
	 */
	private String aadmname;
	private String uadmname;
	private String isorder;
	private int limit;
	private String isGet;
	
	public String getIsGet() {
		return isGet;
	}
	public void setIsGet(String isGet) {
		this.isGet = isGet;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getGet_limit_way() {
		return get_limit_way;
	}
	public void setGet_limit_way(String getLimitWay) {
		get_limit_way = getLimitWay;
	}
	public String getGet_limit_money() {
		return get_limit_money;
	}
	public void setGet_limit_money(String getLimitMoney) {
		get_limit_money = getLimitMoney;
	}
	public String getUse_limit_way() {
		return use_limit_way;
	}
	public void setUse_limit_way(String useLimitWay) {
		use_limit_way = useLimitWay;
	}
	public String getUse_limit_money() {
		return use_limit_money;
	}
	public void setUse_limit_money(String useLimitMoney) {
		use_limit_money = useLimitMoney;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

