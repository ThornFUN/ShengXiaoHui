/*
 * @(#)CodeList.java  2013-9-8
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 下拉编码值dto
 * 
 * @author zhulm
 * @version v2.0.0
 */
public class CodeList extends BaseBean  {
	private static final long serialVersionUID = 1L;
	
	private String id; // 自动编号
	private String text; // 参数显示值
	private String value; // 参数值
	private String type; // 参数类型编码
	private String tips;//web对此参数弹出的提示信息
	private String description; // 参数说明
	private String b_date; // 变更时间
	private String groupid; // 分站编号
	private String gtitle;//分站名称
	private String admin_id; // 管理id
	private String lang_id; // 语言编号
	private String sequence;//排序
	private String flag;//状态
	private String pid;//上级id
	private String shouzhong;//受众
	private String jianjie;//简介
	private String gaikuang;//概况
	private String minval;
	private String maxval;
	private String ptype;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String bDate) {
		b_date = bDate;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGtitle() {
		return gtitle;
	}

	public void setGtitle(String gtitle) {
		this.gtitle = gtitle;
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

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getShouzhong() {
		return shouzhong;
	}

	public void setShouzhong(String shouzhong) {
		this.shouzhong = shouzhong;
	}

	public String getJianjie() {
		return jianjie;
	}

	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}

	public String getGaikuang() {
		return gaikuang;
	}

	public void setGaikuang(String gaikuang) {
		this.gaikuang = gaikuang;
	}

	public String getMinval() {
		return minval;
	}

	public void setMinval(String minval) {
		this.minval = minval;
	}

	public String getMaxval() {
		return maxval;
	}

	public void setMaxval(String maxval) {
		this.maxval = maxval;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
}
