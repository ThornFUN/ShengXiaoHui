/*
 * @(#)Shop.java  2013-11-26
 * 
 * Copyright 2013© 北京铸信至诚科技有限公司, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.admin.utils.FormatUtils;
import com.njsd.base.pojo.BaseBean;

/**
 * 商品信息
 * 
 * @author xull
 * @version v2.0.0
 */
public class Shop extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String id;// 自动编号
	private String sp_id;// 唯一编号
	private String sp_title; // 商品名称
	private String sp_no;// 商品货号
	private String sp_barcode;// 条形码
	private String sp_classification;// 商品类别
	private String sp_brand;// 商品品牌
	private String sp_dealer;// 经销商
	private String sp_price;// 市场售价
	private String sp_mprice;// 普通会员价格
	private String sp_vprice;// vip会员价格
	private String sp_proprice;// 团购价格
	private String sp_discount;// 优惠数量
	private String sp_disprice;// 优惠价格
	private String sp_integral; // 赠送积分
	private String sp_inteprice;// 积分抵扣
	private String sp_probdate; // 促销开始日期
	private String sp_proddate; // 促销结束日期
	private String sequence; // 排序
	private String sp_img; // 商品图片
	private String sp_simg; // 商品缩略图
	private String sp_weight;// 商品重量
	private String sp_count; // 商品数量
	private String sp_flag; // 库存状态
	private String sp_warning; // 警告数量
	private String sp_property; // 状态性质
	private String sp_grounding; // 是否上架
	private String sp_sale; // 普通销售
	private String sp_postage; // 免运费
	private String sp_keyword;// 关键字
	private String sp_discontent;// 简单说明
	private String sp_remarks; // 商品备注
	private String sp_body; // 相信描述
	private String groupid; // 分站编号
	private String lang_id; // 语言编号
	private String admin_id;// 会员编号
	private String sp_date;// 发布时间
	private String sp_small_id;//商品所属栏目
	private String sp_fl; //团购分类
	private String sp_city;//团购区域
	private String sp_lx;//团购类型
	private String sp_tj;//是否推荐
	private String or_count;//团购数量
	private String sp_color;//商品颜色
	private String sp_size;//商品尺码
	private String sp_big_id;//商品所属顶级栏目
	private float max_price; //查询最大价格
	private float min_price; //查询最小价格
	private String sp_noorder; //免预约
	private String sp_overreturn;//过期退
	private String sp_anyreturn;//随时退
	private String c_id;
	private String fangweima;//防伪码
	private String yunfei;
	private String erweima;//二维码
	private String status;//审核状态 0未审核 1审核通过 2审核失败
	private String remark;// 失败原因
	private String del;//是否删除   默认0否  1是
	private String haveping;
	private String filepath;
	private String apply;
	private String appmark;
	private String app_date;
	private String sp_cost;//成本价
	private String provinceid;//省
	private String cityid;//市
	private String isact;//参与促销活动类型
	private String ispf;
	private String pf_num;
	private String pf_price;
	private String com_price;//经销商价格
	private String sp_jxs;//经销商可见
	
	/*
	 * 虚拟
	 */
	private String isFav;
	private String limit;//列表数量
	private String ordercount;
	private String pingcount;
	private String sp_gui;
	private String sp_gui_mini;
	private String classtitle;
	private String vir;
	private String virtext;
	private String youmo;
	private String min;
	private String max;
	private ShopAct sa;
	private String lbids;

	public String getLbids() {
		return lbids;
	}

	public void setLbids(String lbids) {
		this.lbids = lbids;
	}

	public String getSp_gui_mini() {
		return sp_gui_mini;
	}

	public void setSp_gui_mini(String spGuiMini) {
		sp_gui_mini = spGuiMini;
	}

	public String getIspf() {
		return ispf;
	}

	public void setIspf(String ispf) {
		this.ispf = ispf;
	}

	public String getPf_num() {
		return pf_num;
	}

	public void setPf_num(String pfNum) {
		pf_num = pfNum;
	}

	public String getPf_price() {
		return pf_price;
	}

	public void setPf_price(String pfPrice) {
		pf_price = pfPrice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ShopAct getSa() {
		return sa;
	}

	public void setSa(ShopAct sa) {
		this.sa = sa;
	}

	public String getIsact() {
		return isact;
	}

	public void setIsact(String isact) {
		this.isact = isact;
	}

	public String getProvinceid() {
		return provinceid;
	}

	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}

	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public String getYoumo() {
		return youmo;
	}

	public void setYoumo(String youmo) {
		this.youmo = youmo;
	}
	
	public String getClasstitle() {
		return classtitle;
	}

	public void setClasstitle(String classtitle) {
		this.classtitle = classtitle;
	}

	public String getIsFav() {
		return isFav;
	}

	public void setIsFav(String isFav) {
		this.isFav = isFav;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getErweima() {
		return erweima;
	}

	public void setErweima(String erweima) {
		this.erweima = erweima;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}

	public String getYunfei() {
		return yunfei;
	}

	public void setYunfei(String yunfei) {
		this.yunfei = yunfei;
	}

	public String getFangweima() {
		return fangweima;
	}

	public void setFangweima(String fangweima) {
		this.fangweima = fangweima;
	}


	public String getSp_id() {
		return sp_id;
	}

	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}

	public String getSp_title() {
		return sp_title;
	}

	public void setSp_title(String sp_title) {
		this.sp_title = sp_title;
	}

	public String getSp_no() {
		return sp_no;
	}

	public void setSp_no(String sp_no) {
		this.sp_no = sp_no;
	}

	public String getSp_barcode() {
		return sp_barcode;
	}

	public void setSp_barcode(String sp_barcode) {
		this.sp_barcode = sp_barcode;
	}

	public String getSp_classification() {
		return sp_classification;
	}

	public void setSp_classification(String sp_classification) {
		this.sp_classification = sp_classification;
	}

	public String getSp_brand() {
		return sp_brand;
	}

	public void setSp_brand(String sp_brand) {
		this.sp_brand = sp_brand;
	}

	public String getSp_dealer() {
		return sp_dealer;
	}

	public void setSp_dealer(String sp_dealer) {
		this.sp_dealer = sp_dealer;
	}

	public String getSp_price() {
		return FormatUtils.delZero(sp_price);
	}

	public void setSp_price(String sp_price) {
		this.sp_price = sp_price;
	}

	public String getSp_mprice() {
		return sp_mprice;
	}

	public void setSp_mprice(String sp_mprice) {
		this.sp_mprice = sp_mprice;
	}

	public String getSp_vprice() {
		return sp_vprice;
	}

	public void setSp_vprice(String sp_vprice) {
		this.sp_vprice = sp_vprice;
	}

	public String getSp_proprice() {
		return FormatUtils.delZero(sp_proprice);
	}

	public void setSp_proprice(String sp_proprice) {
		this.sp_proprice = sp_proprice;
	}

	public String getSp_discount() {
		return sp_discount;
	}

	public void setSp_discount(String sp_discount) {
		this.sp_discount = sp_discount;
	}

	public String getSp_disprice() {
		return FormatUtils.delZero(sp_disprice);
	}

	public void setSp_disprice(String sp_disprice) {
		this.sp_disprice = sp_disprice;
	}

	public String getSp_integral() {
		return sp_integral;
	}

	public void setSp_integral(String sp_integral) {
		this.sp_integral = sp_integral;
	}

	public String getSp_inteprice() {
		return sp_inteprice;
	}

	public void setSp_inteprice(String sp_inteprice) {
		this.sp_inteprice = sp_inteprice;
	}

	public String getSp_probdate() {
		return sp_probdate;
	}

	public void setSp_probdate(String sp_probdate) {
		this.sp_probdate = sp_probdate;
	}

	public String getSp_proddate() {
		return sp_proddate;
	}

	public void setSp_proddate(String sp_proddate) {
		this.sp_proddate = sp_proddate;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getSp_img() {
		return sp_img;
	}

	public void setSp_img(String sp_img) {
		this.sp_img = sp_img;
	}

	public String getSp_simg() {
		return sp_simg;
	}

	public void setSp_simg(String sp_simg) {
		this.sp_simg = sp_simg;
	}

	public String getSp_weight() {
		return sp_weight;
	}

	public void setSp_weight(String sp_weight) {
		this.sp_weight = sp_weight;
	}

	public String getSp_count() {
		return sp_count;
	}

	public void setSp_count(String sp_count) {
		this.sp_count = sp_count;
	}

	public String getSp_flag() {
		return sp_flag;
	}

	public void setSp_flag(String sp_flag) {
		this.sp_flag = sp_flag;
	}

	public String getSp_warning() {
		return sp_warning;
	}

	public void setSp_warning(String sp_warning) {
		this.sp_warning = sp_warning;
	}

	public String getSp_property() {
		return sp_property;
	}

	public void setSp_property(String sp_property) {
		this.sp_property = sp_property;
	}

	public String getSp_grounding() {
		return sp_grounding;
	}

	public void setSp_grounding(String sp_grounding) {
		this.sp_grounding = sp_grounding;
	}

	public String getSp_sale() {
		return sp_sale;
	}

	public void setSp_sale(String sp_sale) {
		this.sp_sale = sp_sale;
	}

	public String getSp_postage() {
		return sp_postage;
	}

	public void setSp_postage(String sp_postage) {
		this.sp_postage = sp_postage;
	}

	public String getSp_keyword() {
		return sp_keyword;
	}

	public void setSp_keyword(String sp_keyword) {
		this.sp_keyword = sp_keyword;
	}

	public String getSp_discontent() {
		return sp_discontent;
	}

	public void setSp_discontent(String sp_discontent) {
		this.sp_discontent = sp_discontent;
	}

	public String getSp_remarks() {
		return sp_remarks;
	}

	public void setSp_remarks(String sp_remarks) {
		this.sp_remarks = sp_remarks;
	}

	public String getSp_body() {
		return sp_body;
	}

	public void setSp_body(String sp_body) {
		this.sp_body = sp_body;
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

	public String getSp_date() {
		return sp_date;
	}

	public void setSp_date(String sp_date) {
		this.sp_date = sp_date;
	}

	public String getSp_small_id() {
		return sp_small_id;
	}

	public void setSp_small_id(String sp_small_id) {
		this.sp_small_id = sp_small_id;
	}

	public String getSp_fl() {
		return sp_fl;
	}

	public void setSp_fl(String sp_fl) {
		this.sp_fl = sp_fl;
	}

	public String getSp_city() {
		return sp_city;
	}

	public void setSp_city(String sp_city) {
		this.sp_city = sp_city;
	}

	public String getSp_lx() {
		return sp_lx;
	}

	public void setSp_lx(String sp_lx) {
		this.sp_lx = sp_lx;
	}

	public String getSp_tj() {
		return sp_tj;
	}

	public void setSp_tj(String sp_tj) {
		this.sp_tj = sp_tj;
	}

	public String getOr_count() {
		return or_count;
	}

	public void setOr_count(String or_count) {
		this.or_count = or_count;
	}

	public String getSp_color() {
		return sp_color;
	}

	public void setSp_color(String sp_color) {
		this.sp_color = sp_color;
	}

	public String getSp_size() {
		return sp_size;
	}

	public void setSp_size(String sp_size) {
		this.sp_size = sp_size;
	}

	public String getSp_big_id() {
		return sp_big_id;
	}

	public void setSp_big_id(String sp_big_id) {
		this.sp_big_id = sp_big_id;
	}

	public float getMax_price() {
		return max_price;
	}

	public void setMax_price(float max_price) {
		this.max_price = max_price;
	}

	public float getMin_price() {
		return min_price;
	}

	public void setMin_price(float min_price) {
		this.min_price = min_price;
	}

	public String getSp_noorder() {
		return sp_noorder;
	}

	public void setSp_noorder(String sp_noorder) {
		this.sp_noorder = sp_noorder;
	}

	public String getSp_overreturn() {
		return sp_overreturn;
	}

	public void setSp_overreturn(String sp_overreturn) {
		this.sp_overreturn = sp_overreturn;
	}

	public String getSp_anyreturn() {
		return sp_anyreturn;
	}

	public void setSp_anyreturn(String sp_anyreturn) {
		this.sp_anyreturn = sp_anyreturn;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getHaveping() {
		return haveping;
	}

	public void setHaveping(String haveping) {
		this.haveping = haveping;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getApply() {
		return apply;
	}

	public void setApply(String apply) {
		this.apply = apply;
	}

	public String getAppmark() {
		return appmark;
	}

	public void setAppmark(String appmark) {
		this.appmark = appmark;
	}

	public String getApp_date() {
		return app_date;
	}

	public void setApp_date(String app_date) {
		this.app_date = app_date;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getOrdercount() {
		return ordercount;
	}

	public void setOrdercount(String ordercount) {
		this.ordercount = ordercount;
	}

	public String getPingcount() {
		return pingcount;
	}

	public void setPingcount(String pingcount) {
		this.pingcount = pingcount;
	}

	public String getSp_gui() {
		return sp_gui;
	}

	public void setSp_gui(String sp_gui) {
		this.sp_gui = sp_gui;
	}

	public String getSp_cost() {
		return sp_cost;
	}

	public void setSp_cost(String sp_cost) {
		this.sp_cost = sp_cost;
	}

	public String getVir() {
		return vir;
	}

	public void setVir(String vir) {
		this.vir = vir;
	}

	public String getVirtext() {
		return virtext;
	}

	public void setVirtext(String virtext) {
		this.virtext = virtext;
	}

	public String getCom_price() {
		return com_price;
	}

	public void setCom_price(String com_price) {
		this.com_price = com_price;
	}

	public String getSp_jxs() {
		return sp_jxs;
	}

	public void setSp_jxs(String sp_jxs) {
		this.sp_jxs = sp_jxs;
	}
}
