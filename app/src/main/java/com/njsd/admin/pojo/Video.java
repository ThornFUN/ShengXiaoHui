/*
 * @(#)Video.java  2013-9-6
 * 
 * Copyright 2013© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * video
 * 
 * @author zhulm
 * @version v2.0.0
 */
public class Video extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSt_id() {
		return st_id;
	}

	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}

	public String getBig_id() {
		return big_id;
	}

	public void setBig_id(String big_id) {
		this.big_id = big_id;
	}

	public String getSmall_id() {
		return small_id;
	}

	public void setSmall_id(String small_id) {
		this.small_id = small_id;
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

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getE_date() {
		return e_date;
	}

	public void setE_date(String e_date) {
		this.e_date = e_date;
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

	public void setLang_id(String lang_id) {
		this.lang_id = lang_id;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
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
