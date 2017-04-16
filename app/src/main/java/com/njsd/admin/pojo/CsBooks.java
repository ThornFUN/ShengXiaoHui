/*
 * @(#) CsBooks.java 2015-7-6
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * CsBooks.java
 * @author zhulm 2015-7-6
 * @version 1.0
 */
public class CsBooks extends BaseBean {
	private static final long serialVersionUID = -293808264262118169L;
	private String id;
	private String uid;
	private String bid;
	private String img;
	private String title;
	private String body;
	private String btype;
	private String credit;
	private String adate;
	private String flag;
	private String hot;
	private String udate;
	private String status;
	private String hits;
	/*
	 * 虚拟
	 */
	private String isorder;
	private String limit;
	private String isFav;
	private String isGood;
	private String isBad;
	private String favnum;
	private String goodnum;
	private String badnum;
	private CsFile cf;
	private String sfstatus;
	private Member author;
	private Member cur;
	
	public Member getCur() {
		return cur;
	}
	public void setCur(Member cur) {
		this.cur = cur;
	}
	public Member getAuthor() {
		return author;
	}
	public void setAuthor(Member author) {
		this.author = author;
	}
	public String getSfstatus() {
		return sfstatus;
	}
	public void setSfstatus(String sfstatus) {
		this.sfstatus = sfstatus;
	}
	public CsFile getCf() {
		return cf;
	}
	public void setCf(CsFile cf) {
		this.cf = cf;
	}
	public String getHits() {
		return hits;
	}
	public void setHits(String hits) {
		this.hits = hits;
	}
	public String getIsFav() {
		return isFav;
	}
	public void setIsFav(String isFav) {
		this.isFav = isFav;
	}
	public String getIsGood() {
		return isGood;
	}
	public void setIsGood(String isGood) {
		this.isGood = isGood;
	}
	public String getIsBad() {
		return isBad;
	}
	public void setIsBad(String isBad) {
		this.isBad = isBad;
	}
	public String getFavnum() {
		return favnum;
	}
	public void setFavnum(String favnum) {
		this.favnum = favnum;
	}
	public String getGoodnum() {
		return goodnum;
	}
	public void setGoodnum(String goodnum) {
		this.goodnum = goodnum;
	}
	public String getBadnum() {
		return badnum;
	}
	public void setBadnum(String badnum) {
		this.badnum = badnum;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
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
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

