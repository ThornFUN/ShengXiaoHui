/*
 * @(#) ShopClass.java 2016-4-14
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * ShopClass.java
 * @author zhulm 2016-4-14
 * @version 1.0
 */
public class ShopClass extends BaseBean {
	private static final long serialVersionUID = 4690370810552415434L;
	private String id;
	private String spid;
	private String colid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpid() {
		return spid;
	}
	public void setSpid(String spid) {
		this.spid = spid;
	}
	public String getColid() {
		return colid;
	}
	public void setColid(String colid) {
		this.colid = colid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

