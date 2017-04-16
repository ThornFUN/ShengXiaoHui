/*
 * @(#) Location.java 2014-12-10
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * 省市区信息
 * Location.java
 * @author zhulm 2014-12-10
 * @version 1.0
 */
public class Location extends BaseBean {
	private static final long serialVersionUID = -4156347849547257957L;
	
	private String code;//编号
	private String pid;//上级编号
	private String name;//名称
	private String quanpin;//名称全拼
	/*
	 * 虚拟
	 */
	private int sp_num;
	private String getSpNum;
	private List<Location> child;
	
	public String getGetSpNum() {
		return getSpNum;
	}
	public void setGetSpNum(String getSpNum) {
		this.getSpNum = getSpNum;
	}
	public int getSp_num() {
		return sp_num;
	}
	public void setSp_num(int spNum) {
		sp_num = spNum;
	}
	public List<Location> getChild() {
		return child;
	}
	public void setChild(List<Location> child) {
		this.child = child;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuanpin() {
		return quanpin;
	}
	public void setQuanpin(String quanpin) {
		this.quanpin = quanpin;
	}
	
}

