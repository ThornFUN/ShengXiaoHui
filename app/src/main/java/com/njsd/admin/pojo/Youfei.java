/*
 * @(#)Story.java  2015-1-18
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
public class Youfei extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String id;// 自动编号
	private String name;// 名称
	private String code;// 编码
	private String youfei;// 邮费
	private String mid;// 模板id
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getYoufei() {
		return youfei;
	}
	public void setYoufei(String youfei) {
		this.youfei = youfei;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
}
