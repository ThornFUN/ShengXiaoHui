/*
 * @(#) News.java 2014-11-12
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * News.java
 * @author zhulm 2014-11-12
 * @version 1.0
 */
public class News extends BaseBean {
	private static final long serialVersionUID = -1498409718248601507L;
	
	private String id;// 自动编号
	private String st_id; // 唯一编号
	private String big_id; // 栏目编号(父级)
	private String small_id; // 分级编号（子级）
	private String title; // 标题
	private String subtitle; // 副标题
	private String img; // 缩略图
	private String source; // 来源
	private String keywords;// 关键字
	private String discontent; // 说明
	private String url;// 链接地址
	private String sequence;// 排序
	private String flag; // 是否显示
	private String hot; // 是否热点
	private String b_date; // 开始时间
	private String e_date; // 截止日期
	private String body;// 内容说明
	private String groupid; // 分站编号
	private String lang_id; // 语言编号
	private String admin_id; // 管理id
	private String author; // 发布者
	private String number; // 人数
	private String money; // 待遇
	private String address; // 地点
	private String work; // 工作方式
	private String open;//内容展现形式
	private String video;//视频
	private String tel;//联系方式
	private String hit;//点击次数
	
	/*虚拟信息*/
	private String isorder;//排序条件
	private String limit;//列表数量
	private String notnullimg;
	private String notinid;
	
	public String getNotnullimg() {
		return notnullimg;
	}
	public void setNotnullimg(String notnullimg) {
		this.notnullimg = notnullimg;
	}
	public String getNotinid() {
		return notinid;
	}
	public void setNotinid(String notinid) {
		this.notinid = notinid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSt_id() {
		return st_id;
	}
	public void setSt_id(String stId) {
		st_id = stId;
	}
	public String getBig_id() {
		return big_id;
	}
	public void setBig_id(String bigId) {
		big_id = bigId;
	}
	public String getSmall_id() {
		return small_id;
	}
	public void setSmall_id(String smallId) {
		small_id = smallId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDiscontent() {
		return discontent;
	}
	public void setDiscontent(String discontent) {
		this.discontent = discontent;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
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
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String bDate) {
		b_date = bDate;
	}
	public String getE_date() {
		return e_date;
	}
	public void setE_date(String eDate) {
		e_date = eDate;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
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
}

