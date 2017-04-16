/*
 * @(#) Mod.java 2015-12-24
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * Mod.java
 * @author zhulm 2015-12-24
 * @version 1.0
 */
public class Mod extends BaseBean {
	private static final long serialVersionUID = 7992637133490984213L;
	private String id;
	private String mid;
	private String pid;
	private String mtype;//AA79
	private String islimit;//0-不限，1-限制
	private String limits;
	private String areaid;
	private String seq;
	private String flag;
	private String tips;
	private String colid;
	/*
	 * 虚拟
	 */
	private String limit;
	private List<Mod> mls;
	private List<ModContent> mcls;
	private String msize;
	private ClassList cl;
	
	public ClassList getCl() {
		return cl;
	}
	public void setCl(ClassList cl) {
		this.cl = cl;
	}
	public String getMsize() {
		return msize;
	}
	public void setMsize(String msize) {
		this.msize = msize;
	}
	public List<ModContent> getMcls() {
		return mcls;
	}
	public void setMcls(List<ModContent> mcls) {
		this.mcls = mcls;
	}
	public String getColid() {
		return colid;
	}
	public void setColid(String colid) {
		this.colid = colid;
	}
	public List<Mod> getMls() {
		return mls;
	}
	public void setMls(List<Mod> mls) {
		this.mls = mls;
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
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getIslimit() {
		return islimit;
	}
	public void setIslimit(String islimit) {
		this.islimit = islimit;
	}
	public String getLimits() {
		return limits;
	}
	public void setLimits(String limits) {
		this.limits = limits;
	}
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

