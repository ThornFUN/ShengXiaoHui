/*
 * @(#) UserLoan.java 2015-3-30
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * UserLoan.java
 * @author zhulm 2015-3-30
 * @version 1.0
 */
public class UserLoan extends BaseBean {
	private static final long serialVersionUID = 4074409267671092146L;
	
	private String id;//
	private String ulid;//
	private String tid;//项目类型id
	private String pid;//省id
	private String cid;//市id
	private String name;//
	private String tel;//
	private String sex;//
	private String marry;//
	private String money;//
	private String needdate;//
	private String descript;//
	private String adate;//
	private String flag;//
	private String cadm;//
	private String cdate;//
	private String groupid;
	
	/*
	 * 虚拟字段
	 */
	private String pname;
	private String cname;
	private String isorder;
	private String title;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUlid() {
		return ulid;
	}
	public void setUlid(String ulid) {
		this.ulid = ulid;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMarry() {
		return marry;
	}
	public void setMarry(String marry) {
		this.marry = marry;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getNeeddate() {
		return needdate;
	}
	public void setNeeddate(String needdate) {
		this.needdate = needdate;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCadm() {
		return cadm;
	}
	public void setCadm(String cadm) {
		this.cadm = cadm;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

