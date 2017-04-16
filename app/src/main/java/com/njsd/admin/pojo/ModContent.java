/*
 * @(#) ModContent.java 2015-12-24
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * ModContent.java
 * @author zhulm 2015-12-24
 * @version 1.0
 */
public class ModContent extends BaseBean {
	private static final long serialVersionUID = -3512148081222637659L;
	private String id;
	private String mid;
	private String rid;
	private String title;
	private String img;
	private String mctype;//1.栏目2.广告3.文字链接4.图片链接5.商品6.品牌
	private String url;
	/*
	 * 虚拟
	 */
	private String limit;
	private String rbody;
	private Adv ad;
	private ClassList cl;
	private Shop sp;
	
	public Adv getAd() {
		return ad;
	}
	public void setAd(Adv ad) {
		this.ad = ad;
	}
	public ClassList getCl() {
		return cl;
	}
	public void setCl(ClassList cl) {
		this.cl = cl;
	}
	public Shop getSp() {
		return sp;
	}
	public void setSp(Shop sp) {
		this.sp = sp;
	}
	public String getRbody() {
		return rbody;
	}
	public void setRbody(String rbody) {
		this.rbody = rbody;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMctype() {
		return mctype;
	}
	public void setMctype(String mctype) {
		this.mctype = mctype;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

