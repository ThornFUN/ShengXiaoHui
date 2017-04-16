/*
 * @(#)News.java  2013-9-6
 * 
 * 智能平台管理系统.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

import java.util.List;

/**
 * 内容javaBean
 * 
 * @author xull
 * @version v2.0.0
 */
public class Images extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	private String id;// 自动编号
	private String st_id; // 唯一编号
	private String big_id; // 栏目编号(父级)
	private String small_id; // 分级编号（子级）
	private String pid;//图集id
	private String title; // 标题
	private String subtitle; // 副标题
	private String img; // 缩略图
	private String discontent; // 说明
	private String sequence;// 排序
	private String b_date; // 开始时间
	private String groupid; // 分站编号
	private String admin_id; // 管理id
	private String hit;
	private String flag;
	private String hot;
	private String h_img;//推荐图
	private String h_date;//推荐时间
	private String u_date;
	private String isorder;
	private String num;
	private String limit;
	private List<Images> pics;
	
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
	public String getDiscontent() {
		return discontent;
	}
	public void setDiscontent(String discontent) {
		this.discontent = discontent;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String bDate) {
		b_date = bDate;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String adminId) {
		admin_id = adminId;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
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
	public String getH_img() {
		return h_img;
	}
	public void setH_img(String hImg) {
		h_img = hImg;
	}
	public String getH_date() {
		return h_date;
	}
	public void setH_date(String hDate) {
		h_date = hDate;
	}
	public String getU_date() {
		return u_date;
	}
	public void setU_date(String uDate) {
		u_date = uDate;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public List<Images> getPics() {
		return pics;
	}
	public void setPics(List<Images> pics) {
		this.pics = pics;
	}
}
