/*
 * @(#) loan.java 2014-11-26
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;


/**
 * loan.java 贷款,案子
 * @author zhulm 2014-11-26
 * @version 1.0
 */
public class Loan extends BaseBean {
	private static final long serialVersionUID = 1434297757437344507L;
	
	private String id;// 自动编号
	private String l_id;// 唯一编号
	private String user_id;// 会员编号
	private String title;// 任务名称
	private String money;// 贷款金额
	private String groupid;// 分站编号
	private String lang_id;// 语言编号
	private String body;//描述
	private String months;//偿还期限
	private String dy_type;//抵押物品类型
	private String dy_img;//抵押物品截图
	private String a_date;//发布时间
	private String u_date;//更新时间
	private String hit;//点击数
	private String status;//案子状态
	private String chk_status;//审核状态
	private String chk_id;//审核管理id
	private String chk_tips;//审核提示
	private String flag;// 是否显示
	private String f_id;//显示操作管理id
	private String hot;//是否推荐置顶
	private String h_id;//推荐操作管理id
	private String id_num;//身份证号码
	private String id_front_img;//身份证照-正面
	private String id_rear_img;//身份证照-反面
	private String investorid;//投资人id
	private String inv_date;
	private String assistantid;//助理id
	
	/*虚拟信息*/
	private String isorder;//排序条件
	private String limit;//列表数量
	private String safe_id_num;//带*保护的身份证号码
	private String isorderid;//前台列表，排序条件id
	private String moneyid;//金额范围id
	private String b_money;//起始金额范围
	private String e_money;//结尾金额范围
	private Member user;//发布者
	private Member ass;//助理
	private Admin c_adm;
	private Admin f_adm;
	private Admin h_adm;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getL_id() {
		return l_id;
	}
	public void setL_id(String lId) {
		l_id = lId;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String userId) {
		user_id = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
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
	public void setLang_id(String langId) {
		lang_id = langId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
	}
	public String getDy_type() {
		return dy_type;
	}
	public void setDy_type(String dyType) {
		dy_type = dyType;
	}
	public String getDy_img() {
		return dy_img;
	}
	public void setDy_img(String dyImg) {
		dy_img = dyImg;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String aDate) {
		a_date = aDate;
	}
	public String getU_date() {
		return u_date;
	}
	public void setU_date(String uDate) {
		u_date = uDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChk_status() {
		return chk_status;
	}
	public void setChk_status(String chkStatus) {
		chk_status = chkStatus;
	}
	public String getChk_id() {
		return chk_id;
	}
	public void setChk_id(String chkId) {
		chk_id = chkId;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String fId) {
		f_id = fId;
	}
	public String getHot() {
		return hot;
	}
	public void setHot(String hot) {
		this.hot = hot;
	}
	public String getH_id() {
		return h_id;
	}
	public void setH_id(String hId) {
		h_id = hId;
	}
	public String getId_num() {
		return id_num;
	}
	public void setId_num(String idNum) {
		id_num = idNum;
	}
	public String getId_front_img() {
		return id_front_img;
	}
	public void setId_front_img(String idFrontImg) {
		id_front_img = idFrontImg;
	}
	public String getId_rear_img() {
		return id_rear_img;
	}
	public void setId_rear_img(String idRearImg) {
		id_rear_img = idRearImg;
	}
	public String getChk_tips() {
		return chk_tips;
	}
	public void setChk_tips(String chkTips) {
		chk_tips = chkTips;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public Member getUser() {
		return user;
	}
	public void setUser(Member user) {
		this.user = user;
	}
	public Admin getC_adm() {
		return c_adm;
	}
	public void setC_adm(Admin cAdm) {
		c_adm = cAdm;
	}
	public Admin getF_adm() {
		return f_adm;
	}
	public void setF_adm(Admin fAdm) {
		f_adm = fAdm;
	}
	public Admin getH_adm() {
		return h_adm;
	}
	public void setH_adm(Admin hAdm) {
		h_adm = hAdm;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getSafe_id_num() {
		return safe_id_num;
	}
	public void setSafe_id_num(String safeIdNum) {
		safe_id_num = safeIdNum;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getIsorderid() {
		return isorderid;
	}
	public void setIsorderid(String isorderid) {
		this.isorderid = isorderid;
	}
	public String getB_money() {
		return b_money;
	}
	public void setB_money(String bMoney) {
		b_money = bMoney;
	}
	public String getE_money() {
		return e_money;
	}
	public void setE_money(String eMoney) {
		e_money = eMoney;
	}
	public String getMoneyid() {
		return moneyid;
	}
	public void setMoneyid(String moneyid) {
		this.moneyid = moneyid;
	}
	public String getInvestorid() {
		return investorid;
	}
	public void setInvestorid(String investorid) {
		this.investorid = investorid;
	}
	public String getInv_date() {
		return inv_date;
	}
	public void setInv_date(String invDate) {
		inv_date = invDate;
	}
	public String getAssistantid() {
		return assistantid;
	}
	public void setAssistantid(String assistantid) {
		this.assistantid = assistantid;
	}
	public Member getAss() {
		return ass;
	}
	public void setAss(Member ass) {
		this.ass = ass;
	}
	
}

