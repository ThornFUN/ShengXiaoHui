/*
 * @(#) ShopAct.java 2016-3-4
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * ShopAct.java
 * @author zhulm 2016-3-4
 * @version 1.0
 */
public class ShopAct extends BaseBean{
	private static final long serialVersionUID = -4299193481407523041L;
	private String id;
	private String spid;//商品id
	private String aprice;//活动价格
	private String mer;//加价幅度
	private String atype;//0-限时抢购；1-竞拍 AA85
	private String adate;
	private String bdate;//活动开始时间
	private String edate;//活动结束时间
	private String flag;//0-未启用；1-已启用AA86
	private String isrun;//0-未开始；1-进行中；2-已结束AA88
	private String tips;
	/*
	 * 虚拟
	 */
	private Shop sp;
	private List<ShopActUser> saus;
	private String begindate;
	private String enddate;
	private String sptitle;
	private String limit;
	private String uid;
	private String isbid;
	private String isord;
	private String maxPrice;
	
	public String getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getIsord() {
		return isord;
	}
	public void setIsord(String isord) {
		this.isord = isord;
	}
	public String getIsbid() {
		return isbid;
	}
	public void setIsbid(String isbid) {
		this.isbid = isbid;
	}
	public List<ShopActUser> getSaus() {
		return saus;
	}
	public void setSaus(List<ShopActUser> saus) {
		this.saus = saus;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getSptitle() {
		return sptitle;
	}
	public void setSptitle(String sptitle) {
		this.sptitle = sptitle;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getIsrun() {
		return isrun;
	}
	public void setIsrun(String isrun) {
		this.isrun = isrun;
	}
	public String getBegindate() {
		return begindate;
	}
	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
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
	public String getAprice() {
		return aprice;
	}
	public void setAprice(String aprice) {
		this.aprice = aprice;
	}
	public String getMer() {
		return mer;
	}
	public void setMer(String mer) {
		this.mer = mer;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Shop getSp() {
		return sp;
	}
	public void setSp(Shop sp) {
		this.sp = sp;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

