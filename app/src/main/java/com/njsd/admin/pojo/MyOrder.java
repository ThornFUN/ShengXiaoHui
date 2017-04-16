/*
 * @(#)Order.java  2014-1-21
 * 
 * Copyright 2015© 北京铸信至诚科技有限公司, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * 订单管理实体类
 * 
 * @author xull
 * @version v2.0.0
 */
public class MyOrder extends BaseBean {

	private static final long serialVersionUID = 6165368950607163503L;

	private String id; //唯一编号
	private String sp_id; //商品编号
	private String sp_count; //商品数量
	private String sp_price; //商品价格
	private String or_flag; //订单状态
	private String groupid; //分站编号
	private String lang_id; //语言编号
	private String admin_id; 
	private String or_date; //订单日期
	private String sp_total;//商品总价
	private String a_id;//地址唯一编号
	private String sp_grounding; // 是否上架
	private String c_id;
	private String sp_title;
	private String sp_dealer;
	private String u_phone;
	private String u_id;
	private String order_id;
	private String name;
	private String phone;
	private String addr;
	private String distribution;
	private String isorder;
	private String sp_postage;
	private String yunfei;
	private String nowcount;
	private String sp_simg;
	private String payStatus;
	private String haveping;//为1有评论
	private String u_account;
	private String wuliu;//物流
	private String wuliuid;//物流编号
	private String tmark;//退货理由
	private String jmark;//拒收理由
	private String smark;//申诉理由
	private String dmark;//申诉答复
	private String m_date;
	private String color;//颜色
	private String gui;//规格
	private String profit;//利润
	private String fa_date;
	private String shou_date;
	private String actid;
	
	private List<MyOrder> clds;//同一订单号下商品列表
	private String wxpay;//微信支付金额
	private String vir;//虚拟订单
	private String virid;//虚拟商品id
	private int isFanli; 
	private String openid;
	private String payway;//AA89;1-wx,2-zhifubao,3-yue 
	private String enddate;
	private String twuliu;
	private String twuliuid;
	private String youmo;
	private String youfei;
	private ShopAct sa;
	private String limit;
	private Shop sp;
	private String pay_pwd;// 支付密码
	private String isscore;
	private String u_delete = "0";
	
	public String getIsscore() {
		return isscore;
	}
	public void setIsscore(String isscore) {
		this.isscore = isscore;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPay_pwd() {
		return pay_pwd;
	}
	public void setPay_pwd(String pay_pwd) {
		this.pay_pwd = pay_pwd;
	}
	public Shop getSp() {
		return sp;
	}
	public void setSp(Shop sp) {
		this.sp = sp;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public ShopAct getSa() {
		return sa;
	}
	public void setSa(ShopAct sa) {
		this.sa = sa;
	}
	public String getActid() {
		return actid;
	}
	public void setActid(String actid) {
		this.actid = actid;
	}
	public String getYoufei() {
		return youfei;
	}
	public void setYoufei(String youfei) {
		this.youfei = youfei;
	}
	public String getYoumo() {
		return youmo;
	}
	public void setYoumo(String youmo) {
		this.youmo = youmo;
	}
	public String getTwuliu() {
		return twuliu;
	}
	public void setTwuliu(String twuliu) {
		this.twuliu = twuliu;
	}
	public String getTwuliuid() {
		return twuliuid;
	}
	public void setTwuliuid(String twuliuid) {
		this.twuliuid = twuliuid;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String mDate) {
		m_date = mDate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public int getIsFanli() {
		return isFanli;
	}
	public void setIsFanli(int isFanli) {
		this.isFanli = isFanli;
	}
	public String getFa_date() {
		return fa_date;
	}
	public void setFa_date(String faDate) {
		fa_date = faDate;
	}
	public String getShou_date() {
		return shou_date;
	}
	public void setShou_date(String shouDate) {
		shou_date = shouDate;
	}
	public String getWuliuid() {
		return wuliuid;
	}
	public void setWuliuid(String wuliuid) {
		this.wuliuid = wuliuid;
	}
	public List<MyOrder> getClds() {
		return clds;
	}
	public void setClds(List<MyOrder> clds) {
		this.clds = clds;
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
	public String getSp_count() {
		return sp_count;
	}
	public void setSp_count(String sp_count) {
		this.sp_count = sp_count;
	}
	public String getSp_price() {
		return sp_price;
	}
	public void setSp_price(String sp_price) {
		this.sp_price = sp_price;
	}
	public String getOr_flag() {
		return or_flag;
	}
	public void setOr_flag(String or_flag) {
		this.or_flag = or_flag;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getLang_id() {
		return lang_id;
	}
	public void setLang_id(String lang_id) {
		this.lang_id = lang_id;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getOr_date() {
		return or_date;
	}
	public void setOr_date(String or_date) {
		this.or_date = or_date;
	}
	public String getSp_total() {
		return sp_total;
	}
	public void setSp_total(String sp_total) {
		this.sp_total = sp_total;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getSp_title() {
		return sp_title;
	}
	public void setSp_title(String sp_title) {
		this.sp_title = sp_title;
	}
	public String getSp_dealer() {
		return sp_dealer;
	}
	public void setSp_dealer(String sp_dealer) {
		this.sp_dealer = sp_dealer;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getDistribution() {
		return distribution;
	}
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}
	public String getYunfei() {
		return yunfei;
	}
	public void setYunfei(String yunfei) {
		this.yunfei = yunfei;
	}
	public String getNowcount() {
		return nowcount;
	}
	public void setNowcount(String nowcount) {
		this.nowcount = nowcount;
	}
	public String getSp_postage() {
		return sp_postage;
	}
	public void setSp_postage(String sp_postage) {
		this.sp_postage = sp_postage;
	}
	public String getSp_simg() {
		return sp_simg;
	}
	public void setSp_simg(String sp_simg) {
		this.sp_simg = sp_simg;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getHaveping() {
		return haveping;
	}
	public void setHaveping(String haveping) {
		this.haveping = haveping;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String u_account) {
		this.u_account = u_account;
	}
	public String getWuliu() {
		return wuliu;
	}
	public void setWuliu(String wuliu) {
		this.wuliu = wuliu;
	}
	public String getTmark() {
		return tmark;
	}
	public void setTmark(String tmark) {
		this.tmark = tmark;
	}
	public String getJmark() {
		return jmark;
	}
	public void setJmark(String jmark) {
		this.jmark = jmark;
	}
	public String getSmark() {
		return smark;
	}
	public void setSmark(String smark) {
		this.smark = smark;
	}
	public String getDmark() {
		return dmark;
	}
	public void setDmark(String dmark) {
		this.dmark = dmark;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGui() {
		return gui;
	}
	public void setGui(String gui) {
		this.gui = gui;
	}
	public String getProfit() {
		return profit;
	}
	public void setProfit(String profit) {
		this.profit = profit;
	}
	public String getWxpay() {
		return wxpay;
	}
	public void setWxpay(String wxpay) {
		this.wxpay = wxpay;
	}
	public String getVirid() {
		return virid;
	}
	public void setVirid(String virid) {
		this.virid = virid;
	}
	public String getVir() {
		return vir;
	}
	public void setVir(String vir) {
		this.vir = vir;
	}
	public String getPayway() {
		return payway;
	}
	public void setPayway(String payway) {
		this.payway = payway;
	}
	public String getSp_grounding() {
		return sp_grounding;
	}
	public void setSp_grounding(String sp_grounding) {
		this.sp_grounding = sp_grounding;
	}
	public String getU_delete() {
		return u_delete;
	}
	public void setU_delete(String u_delete) {
		this.u_delete = u_delete;
	}
}
