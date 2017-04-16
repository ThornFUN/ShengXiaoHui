/*
 * @(#)ClassList.java  2013-9-6
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * 栏目javaBean
 * 
 * @author zhulm
 * @version v2.0.0
 */
public class ClassList extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	private String id; // 自动编号
	private String big_id;// 唯一编号(父级)
	private String small_id;// 分级编号（子级）
	private String title;// 标题
	private String subtitle; // 副标题
	private String img; // 缩略图
	private String url; // 链接地址
	private String sequence; // 排序
	private String flag;// 是否显示
	private String hot; // 是否热点
	private String b_date; // 开始时间
	private String e_date; // 截止日期
	private String body; // 内容说明
	private String mode_id; // 模板编号
	private String groupid; // 分站编号
	private String lang_id; // 语言编号
	private String admin_id; // 管理id
	private String openfs;//target值
	private String newsSize;//栏目下新闻条数
	private String big_title;//父级标题名称
	
	private List<ClassList> children;//子栏目信息
	private List<News> ns;//新闻内容
	private List<Shop> sps;//商品类别
	private List<News> news;//内容列表
	private List<Video> videos;//视频列表
	private List<Images> images;//图集
	private String treeurl;
	private List<Shop> shops;//子栏目信息
	private String limit;
	private String issel;

	public String getIssel() {
		return issel;
	}

	public void setIssel(String issel) {
		this.issel = issel;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public List<News> getNs() {
		return ns;
	}

	public void setNs(List<News> ns) {
		this.ns = ns;
	}

	public List<Shop> getSps() {
		return sps;
	}

	public void setSps(List<Shop> sps) {
		this.sps = sps;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getMode_id() {
		return mode_id;
	}

	public void setMode_id(String mode_id) {
		this.mode_id = mode_id;
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

	public String getOpenfs() {
		return openfs;
	}

	public void setOpenfs(String openfs) {
		this.openfs = openfs;
	}

	public String getNewsSize() {
		return newsSize;
	}

	public void setNewsSize(String newsSize) {
		this.newsSize = newsSize;
	}

	public List<ClassList> getChildren() {
		return children;
	}

	public void setChildren(List<ClassList> children) {
		this.children = children;
	}

	public String getBig_title() {
		return big_title;
	}

	public void setBig_title(String big_title) {
		this.big_title = big_title;
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public String getTreeurl() {
		return treeurl;
	}

	public void setTreeurl(String treeurl) {
		this.treeurl = treeurl;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	
}
