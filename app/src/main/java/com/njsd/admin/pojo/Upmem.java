/*
 * @(#) UserLoan.java 2015-3-30
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Upmem.java
 * @author chuyao 2015-7-02
 * @version 1.0
 */
public class Upmem extends BaseBean {
	private static final long serialVersionUID = 4074409267671092146L;
	
	private String id;//
	private String user_id;//用户ID
	private String state;//申请中-0，申请成功-1，申请失败-2
	private String remark;//失败原因
	private String a_date;//申请时间
	private String type;//企业会员-0，专家会员-1
	private String pic;//照片
	private String number;//证件号
	private String name;//名称
	private String phone;//联系方式
	private String danye;//申请单页状态，未完善-0，完善中-1，申请中-,2，申请成功-3，申请失败-4
	private String dremark;//单页备注
	private String ddate;//单页申请时间
	private String img;//封面
	private String title;//标题
	private String body;//内容
	
	
	/*
	 * 虚拟字段
	 */
	private String isorder;
	private String limit;
	
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String a_date) {
		this.a_date = a_date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDremark() {
		return dremark;
	}
	public void setDremark(String dremark) {
		this.dremark = dremark;
	}
	public String getDdate() {
		return ddate;
	}
	public void setDdate(String ddate) {
		this.ddate = ddate;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getDanye() {
		return danye;
	}
	public void setDanye(String danye) {
		this.danye = danye;
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
}

