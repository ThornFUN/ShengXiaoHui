/*
 * @(#) Witkey.java 2014-11-12
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Witkey.java
 * @author zhulm 2014-11-12
 * @version 1.0
 */
public class Witkey extends BaseBean {
	private static final long serialVersionUID = -7121363070466316478L;
	
	private String id;// 自动编号
	private String wk_id;// 唯一编号
	private String user_id;// 会员编号
	private String wk_title;// 任务名称
	private String wk_minprice;// 任务最低赏金
	private String wk_maxprice;// 任务最高赏金
	private String wk_allocation;// 赏金分配
	private String wk_type;// 任务类型
	private String wk_bigclassification;// 任务大分类
	private String wk_smallclassification;// 任务小分类
	private String wk_need;// 需求类型
	private String wk_fixed;// 保证选标
	private String wk_status;// 需求状态
	private String wk_deal;// 交易方式
	private String groupid;// 分站编号
	private String lang_id;// 语言编号
	private String admin_id;// 管理id
	private String wk_deposit;// 赏金托管
	private String wk_body;// 任务具体说明
	private String wk_bdate;// 需求发布时间
	private String wk_edate;// 需求截止时间
	private String count;// 投标数
	private String minprice;//列表显示最小金额
	private String maxprice;//列表显示最大金额
	private boolean complete;//任务是否完成
	private String wk_img;//需求图片
	private String wk_file;//需求附件
	private String distanceTime;//相差时间
	private String checkStatus;//审核状态
	private String flag;// 是否显示
	private String hot;//是否热点
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWk_id() {
		return wk_id;
	}
	public void setWk_id(String wkId) {
		wk_id = wkId;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String userId) {
		user_id = userId;
	}
	public String getWk_title() {
		return wk_title;
	}
	public void setWk_title(String wkTitle) {
		wk_title = wkTitle;
	}
	public String getWk_minprice() {
		return wk_minprice;
	}
	public void setWk_minprice(String wkMinprice) {
		wk_minprice = wkMinprice;
	}
	public String getWk_maxprice() {
		return wk_maxprice;
	}
	public void setWk_maxprice(String wkMaxprice) {
		wk_maxprice = wkMaxprice;
	}
	public String getWk_allocation() {
		return wk_allocation;
	}
	public void setWk_allocation(String wkAllocation) {
		wk_allocation = wkAllocation;
	}
	public String getWk_type() {
		return wk_type;
	}
	public void setWk_type(String wkType) {
		wk_type = wkType;
	}
	public String getWk_bigclassification() {
		return wk_bigclassification;
	}
	public void setWk_bigclassification(String wkBigclassification) {
		wk_bigclassification = wkBigclassification;
	}
	public String getWk_smallclassification() {
		return wk_smallclassification;
	}
	public void setWk_smallclassification(String wkSmallclassification) {
		wk_smallclassification = wkSmallclassification;
	}
	public String getWk_need() {
		return wk_need;
	}
	public void setWk_need(String wkNeed) {
		wk_need = wkNeed;
	}
	public String getWk_fixed() {
		return wk_fixed;
	}
	public void setWk_fixed(String wkFixed) {
		wk_fixed = wkFixed;
	}
	public String getWk_status() {
		return wk_status;
	}
	public void setWk_status(String wkStatus) {
		wk_status = wkStatus;
	}
	public String getWk_deal() {
		return wk_deal;
	}
	public void setWk_deal(String wkDeal) {
		wk_deal = wkDeal;
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
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String adminId) {
		admin_id = adminId;
	}
	public String getWk_deposit() {
		return wk_deposit;
	}
	public void setWk_deposit(String wkDeposit) {
		wk_deposit = wkDeposit;
	}
	public String getWk_body() {
		return wk_body;
	}
	public void setWk_body(String wkBody) {
		wk_body = wkBody;
	}
	public String getWk_bdate() {
		return wk_bdate;
	}
	public void setWk_bdate(String wkBdate) {
		wk_bdate = wkBdate;
	}
	public String getWk_edate() {
		return wk_edate;
	}
	public void setWk_edate(String wkEdate) {
		wk_edate = wkEdate;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getMinprice() {
		return minprice;
	}
	public void setMinprice(String minprice) {
		this.minprice = minprice;
	}
	public String getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(String maxprice) {
		this.maxprice = maxprice;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	public String getWk_img() {
		return wk_img;
	}
	public void setWk_img(String wkImg) {
		wk_img = wkImg;
	}
	public String getWk_file() {
		return wk_file;
	}
	public void setWk_file(String wkFile) {
		wk_file = wkFile;
	}
	public String getDistanceTime() {
		return distanceTime;
	}
	public void setDistanceTime(String distanceTime) {
		this.distanceTime = distanceTime;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
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
}

