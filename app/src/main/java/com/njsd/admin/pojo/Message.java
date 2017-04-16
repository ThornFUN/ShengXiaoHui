package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

public class Message extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String id; // 自动编号
	private String user_id;// 唯一编号
	private String send_id;
	private String title;
	private String msg;
	private String n_date;
	private String state;
	private String d_date;
	private String groupid;
	private String is_read;
	private String type;
	
	private String isorder;//排序条件
	private String limit;//列表数量
	
	private String sname;// 收件人姓名
	private String fname;// 发件人姓名
	
	private String is_view;//是否已浏览过
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String userId) {
		user_id = userId;
	}
	public String getSend_id() {
		return send_id;
	}
	public void setSend_id(String sendId) {
		send_id = sendId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getN_date() {
		return n_date;
	}
	public void setN_date(String nDate) {
		n_date = nDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getD_date() {
		return d_date;
	}
	public void setD_date(String dDate) {
		d_date = dDate;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getIs_read() {
		return is_read;
	}
	public void setIs_read(String isRead) {
		is_read = isRead;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getIs_view() {
		return is_view;
	}
	public void setIs_view(String is_view) {
		this.is_view = is_view;
	}
}
