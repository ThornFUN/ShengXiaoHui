package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;


public class Word extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String id; // 自动编号
	private String word;// 敏感词汇
	
	private String isorder;//排序条件
	private String limit;//列表数量
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
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
