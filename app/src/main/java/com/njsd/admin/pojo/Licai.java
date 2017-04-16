/*
 * @(#) Licai.java 2015-4-2
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * 
 * Licai.java
 * @author zhulm
 * @date 2015-4-2
 * @version 1.0
 */

public class Licai extends BaseBean {
	private static final long serialVersionUID = -3204741732510844345L;
	private String id;
	private String lcid;//理财产品编号
	private String title;//
	private String logo;
	private String lctype;//理财分类AA48
	private String itemtype;//项目类型AA49
	private String money;//金额
	private String yearrate;//年利率
	private String repayway;//还款方式AA51
	private String repaymonth;//还款期限
	private String unitprice;//单价
	private String num;//数量
	private String guarantway;//保障方式AA60
	private String guarantid;//担保方id
	private String ulid;//申请记录id
	private String utype;//借款人类型AA59
	private String uname;//借款人
	private String upid;//借款人 省
	private String ucid;//借款人 市
	private String uadate;//借款人 注册时间
	private String udesc;//融资方信息
	private String descript;//项目概况
	private String analyse;//项目分析
	private String flag;//显示状态AA57
	private String hot;//推荐状态AA58
	private String status;//借款标状态AA56
	private String hits;//点击数
	private String invdays;//上线投标天数
	private String invdate;//开始上线投标时间
	private String aadm;
	private String adate;
	private String uadm;
	private String udate;
	/*
	 *虚拟字段 
	 */
	private String upname;//借款人 省
	private String ucname;//借款人 市
	private UserLoan ul;//借款申请记录
	private List<LicaiImgs> imgs;//图册
	private List<LicaiCheck> chks;//审核记录
	private Company guarant;//担保方
	private Admin aadmin;
	private Admin uadmin;
	private String isorder;
	private int limit;
	private String minrate;
	private String maxrate;
	private String minmonth;
	private String maxmonth;
	private int pay_num;//已支付的投标份数
	private int unpay_num; //未支付的投标份数
	private int repay_num;//已结清的投标份数
	private boolean isinvest;//可投标状态    ---未启用
	private List<CdInvest> cis;//投标记录
	private String inv_enddate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLcid() {
		return lcid;
	}
	public void setLcid(String lcid) {
		this.lcid = lcid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLctype() {
		return lctype;
	}
	public void setLctype(String lctype) {
		this.lctype = lctype;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getYearrate() {
		return yearrate;
	}
	public void setYearrate(String yearrate) {
		this.yearrate = yearrate;
	}
	public String getRepayway() {
		return repayway;
	}
	public void setRepayway(String repayway) {
		this.repayway = repayway;
	}
	public String getRepaymonth() {
		return repaymonth;
	}
	public void setRepaymonth(String repaymonth) {
		this.repaymonth = repaymonth;
	}
	public String getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getGuarantway() {
		return guarantway;
	}
	public void setGuarantway(String guarantway) {
		this.guarantway = guarantway;
	}
	public String getGuarantid() {
		return guarantid;
	}
	public void setGuarantid(String guarantid) {
		this.guarantid = guarantid;
	}
	public String getUlid() {
		return ulid;
	}
	public void setUlid(String ulid) {
		this.ulid = ulid;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpid() {
		return upid;
	}
	public void setUpid(String upid) {
		this.upid = upid;
	}
	public String getUcid() {
		return ucid;
	}
	public void setUcid(String ucid) {
		this.ucid = ucid;
	}
	public String getUadate() {
		return uadate;
	}
	public void setUadate(String uadate) {
		this.uadate = uadate;
	}
	public String getUdesc() {
		return udesc;
	}
	public void setUdesc(String udesc) {
		this.udesc = udesc;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getAnalyse() {
		return analyse;
	}
	public void setAnalyse(String analyse) {
		this.analyse = analyse;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHits() {
		return hits;
	}
	public void setHits(String hits) {
		this.hits = hits;
	}
	public String getAadm() {
		return aadm;
	}
	public void setAadm(String aadm) {
		this.aadm = aadm;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getUadm() {
		return uadm;
	}
	public void setUadm(String uadm) {
		this.uadm = uadm;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getUpname() {
		return upname;
	}
	public void setUpname(String upname) {
		this.upname = upname;
	}
	public String getUcname() {
		return ucname;
	}
	public void setUcname(String ucname) {
		this.ucname = ucname;
	}
	public UserLoan getUl() {
		return ul;
	}
	public void setUl(UserLoan ul) {
		this.ul = ul;
	}
	public List<LicaiImgs> getImgs() {
		return imgs;
	}
	public void setImgs(List<LicaiImgs> imgs) {
		this.imgs = imgs;
	}
	public List<LicaiCheck> getChks() {
		return chks;
	}
	public void setChks(List<LicaiCheck> chks) {
		this.chks = chks;
	}
	public Company getGuarant() {
		return guarant;
	}
	public void setGuarant(Company guarant) {
		this.guarant = guarant;
	}
	public Admin getAadmin() {
		return aadmin;
	}
	public void setAadmin(Admin aadmin) {
		this.aadmin = aadmin;
	}
	public Admin getUadmin() {
		return uadmin;
	}
	public void setUadmin(Admin uadmin) {
		this.uadmin = uadmin;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getMinrate() {
		return minrate;
	}
	public void setMinrate(String minrate) {
		this.minrate = minrate;
	}
	public String getMaxrate() {
		return maxrate;
	}
	public void setMaxrate(String maxrate) {
		this.maxrate = maxrate;
	}
	public String getMinmonth() {
		return minmonth;
	}
	public void setMinmonth(String minmonth) {
		this.minmonth = minmonth;
	}
	public String getMaxmonth() {
		return maxmonth;
	}
	public void setMaxmonth(String maxmonth) {
		this.maxmonth = maxmonth;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getPay_num() {
		return pay_num;
	}
	public void setPay_num(int payNum) {
		pay_num = payNum;
	}
	public int getUnpay_num() {
		return unpay_num;
	}
	public void setUnpay_num(int unpayNum) {
		unpay_num = unpayNum;
	}
	public boolean isIsinvest() {
		return isinvest;
	}
	public void setIsinvest(boolean isinvest) {
		this.isinvest = isinvest;
	}
	public List<CdInvest> getCis() {
		return cis;
	}
	public void setCis(List<CdInvest> cis) {
		this.cis = cis;
	}
	public int getRepay_num() {
		return repay_num;
	}
	public void setRepay_num(int repayNum) {
		repay_num = repayNum;
	}
	public String getInvdays() {
		return invdays;
	}
	public void setInvdays(String invdays) {
		this.invdays = invdays;
	}
	public String getInvdate() {
		return invdate;
	}
	public void setInvdate(String invdate) {
		this.invdate = invdate;
	}
	public String getInv_enddate() {
		return inv_enddate;
	}
	public void setInv_enddate(String invEnddate) {
		inv_enddate = invEnddate;
	}
}
