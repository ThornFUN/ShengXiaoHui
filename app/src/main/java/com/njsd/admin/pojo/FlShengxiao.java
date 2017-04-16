/*
 * @(#) FlMoney.java 2015-9-28
 * 
 * Copyright 2014© 南京硕德信息技术有限公司, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * 生肖金额记录
 * @author wangjie
 * @version 1.0
 */

public class FlShengxiao  extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String id;
	private String user_id;//下级会员
	private String admin_id;//上级
	private String shengxiao_id;//产品id
	private String flag;// 1:付款 2：会员打款（返利给上级） 3：学霸收益或平台费 4:利息 5:管理费
	private String money;
	private String adate;
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
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getShengxiao_id() {
		return shengxiao_id;
	}
	public void setShengxiao_id(String shengxiao_id) {
		this.shengxiao_id = shengxiao_id;
	}
}
