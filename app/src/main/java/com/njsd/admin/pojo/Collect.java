package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;


/**
 * 商品收藏
 * @author caohehe
 *
 */
public class Collect extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String id;//自动编号	
	private String user_id;//用户id
	private String shop_id;//商品id
	private String u_date;//收藏时间
	
	//虚拟字段
	private String sp_title;//商品名称
	private String sp_simg;//商品缩略图
	private String sp_mprice;//商品价格
	private String sp_grounding;//是否上架
	private String limit;
	
	
	
	public String getSp_grounding() {
		return sp_grounding;
	}
	public void setSp_grounding(String sp_grounding) {
		this.sp_grounding = sp_grounding;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getSp_mprice() {
		return sp_mprice;
	}
	public void setSp_mprice(String sp_mprice) {
		this.sp_mprice = sp_mprice;
	}
	public String getSp_simg() {
		return sp_simg;
	}
	public void setSp_simg(String sp_simg) {
		this.sp_simg = sp_simg;
	}
	public String getSp_title() {
		return sp_title;
	}
	public void setSp_title(String sp_title) {
		this.sp_title = sp_title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getU_date() {
		return u_date;
	}
	public void setU_date(String u_date) {
		this.u_date = u_date;
	}
}
