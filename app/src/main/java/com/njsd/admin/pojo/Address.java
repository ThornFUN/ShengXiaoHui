/*
 * @(#)Address.java  2014-1-24
 * 
 * Copyright 2015© 北京铸信至诚科技有限公司, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 收件人地址实体类
 * 
 * @author xull
 * @version v2.0.0
 */
public class Address extends BaseBean {

	private static final long serialVersionUID = -5286021820380433042L;

	private String id;
	private String prov;
	private String city;
	private String area;
	private String post;
	private String addressDetail;
	private String fullName;
	private String mobile;
	private String m_id;
	private String sequence;
	
	
	//新增字段
	private String user_id;
	private String groupid;
	
	private String provincialName;
	private String cityName;
	private String areaName;

	
	public String getProvincialName() {
		return provincialName;
	}

	public void setProvincialName(String provincialName) {
		this.provincialName = provincialName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProv() {
		return prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	
}
