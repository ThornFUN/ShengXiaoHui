/*
 * @(#) Admin.java 2014-11-12
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Admin.java
 * @author zhulm 2014-11-12
 * @version 1.0
 */
public class Admin extends BaseBean {
	private static final long serialVersionUID = 8108914680664320628L;
	
	private String id; //自动编号
	private String a_account;  //会员账号
	private String a_password;//登录密码
	private String a_flag; //审核状态0未审核1审核通过2审核未通过3停用
	private String a_level; //级别0普通1高级
	private String a_name; //姓名
	private String a_sex; //性别0女1男
	private String a_tel; //联系电话
	private String a_address; //联系地址
	private String a_zip; //邮编
	private String a_email;  //邮箱
	private String a_qq; //qq
	private String a_remark; //备注
	private String a_role; //角色0管理员1个人会员2企业会员
	private String b_date; //开始时间
	private String e_date; //结束时间
	private String groupid; //分站编号
	private String admin_id;//管理id
	private String lang_id;//语言编号
	private String verifyCode; //验证码
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getA_account() {
		return a_account;
	}
	public void setA_account(String aAccount) {
		a_account = aAccount;
	}
	public String getA_password() {
		return a_password;
	}
	public void setA_password(String aPassword) {
		a_password = aPassword;
	}
	public String getA_flag() {
		return a_flag;
	}
	public void setA_flag(String aFlag) {
		a_flag = aFlag;
	}
	public String getA_level() {
		return a_level;
	}
	public void setA_level(String aLevel) {
		a_level = aLevel;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String aName) {
		a_name = aName;
	}
	public String getA_sex() {
		return a_sex;
	}
	public void setA_sex(String aSex) {
		a_sex = aSex;
	}
	public String getA_tel() {
		return a_tel;
	}
	public void setA_tel(String aTel) {
		a_tel = aTel;
	}
	public String getA_address() {
		return a_address;
	}
	public void setA_address(String aAddress) {
		a_address = aAddress;
	}
	public String getA_zip() {
		return a_zip;
	}
	public void setA_zip(String aZip) {
		a_zip = aZip;
	}
	public String getA_email() {
		return a_email;
	}
	public void setA_email(String aEmail) {
		a_email = aEmail;
	}
	public String getA_qq() {
		return a_qq;
	}
	public void setA_qq(String aQq) {
		a_qq = aQq;
	}
	public String getA_remark() {
		return a_remark;
	}
	public void setA_remark(String aRemark) {
		a_remark = aRemark;
	}
	public String getA_role() {
		return a_role;
	}
	public void setA_role(String aRole) {
		a_role = aRole;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String bDate) {
		b_date = bDate;
	}
	public String getE_date() {
		return e_date;
	}
	public void setE_date(String eDate) {
		e_date = eDate;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String adminId) {
		admin_id = adminId;
	}
	public String getLang_id() {
		return lang_id;
	}
	public void setLang_id(String langId) {
		lang_id = langId;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
}

