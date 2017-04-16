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
public class Virs extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String id; // 自动编号
	private String sp_id; // 商品id
	private String virtext; // 名称
	private String status;//状态
	
	private String sp_title;//商品名称
	
	public String getSp_title() {
		return sp_title;
	}
	public void setSp_title(String sp_title) {
		this.sp_title = sp_title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
	public String getVirtext() {
		return virtext;
	}
	public void setVirtext(String virtext) {
		this.virtext = virtext;
	}
}
