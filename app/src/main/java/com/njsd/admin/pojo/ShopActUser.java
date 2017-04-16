/*
 * @(#) ShopActUser.java 2016-3-4
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * ShopActUser.java
 * @author zhulm 2016-3-4
 * @version 1.0
 */
public class ShopActUser extends BaseBean {
	private static final long serialVersionUID = -2263008671253868729L;
	private String id;
	private String actid;//活动id
	private String atype;//活动类型
	private String anum;//活动获得商品数量
	private String spid;
	private String uid;
	private String price;//活动价格
	private String flag;//0-未中标；1-已中标 AA87
	private String adate;
	/*
	 * 虚拟
	 */
	private String limit;
	private String uname;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActid() {
		return actid;
	}
	public void setActid(String actid) {
		this.actid = actid;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getAnum() {
		return anum;
	}
	public void setAnum(String anum) {
		this.anum = anum;
	}
	public String getSpid() {
		return spid;
	}
	public void setSpid(String spid) {
		this.spid = spid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

