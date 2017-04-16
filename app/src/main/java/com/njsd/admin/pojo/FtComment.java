/*
 * @(#) FtComment.java 2015-6-11
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * FtComment.java
 * @author zhulm 2015-6-11
 * @version 1.0
 */
public class FtComment extends BaseBean {
	private static final long serialVersionUID = 6621284576230711793L;
	private String id;
	private String xmid;
	private String pid;
	private String uid;
	private String content;
	private String adate;
	private String flag;
	private String hot;
	private String fadm;
	private String fdate;
	private String hadm;
	private String hdate;
	/*
	 * 虚拟
	 */
	private String u_img;
	private String u_account;
	private String isorder;
	private String limit;
	private List<FtComment> childs;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getXmid() {
		return xmid;
	}
	public void setXmid(String xmid) {
		this.xmid = xmid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public String getHot() {
		return hot;
	}
	public void setHot(String hot) {
		this.hot = hot;
	}
	public String getFadm() {
		return fadm;
	}
	public void setFadm(String fadm) {
		this.fadm = fadm;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getHadm() {
		return hadm;
	}
	public void setHadm(String hadm) {
		this.hadm = hadm;
	}
	public String getHdate() {
		return hdate;
	}
	public void setHdate(String hdate) {
		this.hdate = hdate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public List<FtComment> getChilds() {
		return childs;
	}
	public void setChilds(List<FtComment> childs) {
		this.childs = childs;
	}
	public String getU_img() {
		return u_img;
	}
	public void setU_img(String uImg) {
		u_img = uImg;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String uAccount) {
		u_account = uAccount;
	}
}

