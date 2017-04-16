/*
 * @(#)Param.java  2013-9-8
 * 
 * 智能平台管理系统.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 
 * 
 * @author xull
 * @version v2.0.0
 */
public class Sparam extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String id; // 自动编号
	private String sp_id; // 商品id
	private String name; // 名称
	private String type; // 类型
	private String status;//状态
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
