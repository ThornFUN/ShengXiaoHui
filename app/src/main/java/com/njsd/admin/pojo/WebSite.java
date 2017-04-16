/*
 * @(#)WebSite.java  2013-8-26
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * 站点信息javaBean
 * 
 * @author zhulm
 * @version v2.0.0
 */
public class WebSite extends BaseBean {
	private static final long serialVersionUID = 2630416147013331715L;
	
	private String id; // 自动编号
	private String title; // 标题
	private String name;// 单位名称
	private String icp;
	private String img; // 标志
	private String logo;
	private String source; // 公司名称
	private String keywords; // 关键字
	private String discontent; // 说明
	private String url; // 域名
	private String tel; // 热线电话
	private String body; // 版权说明
	private String groupid; // 分站编号
	private String lang_id; // 语言编号
	private String admin_id; // 管理id
	private String icon;// 网站小图标
	private String apk_url;
	private String ipa_url;
	private String qr;//二维码
	private String reg_mail;//邮箱账号
	private String reg_mail_host;//邮箱端口
	private String reg_mail_pwd;//邮箱密码
	private String reg_tel;//短信接口账号
	private String reg_tel_url;//短信接口链接
	private String reg_tel_pwd;//短信接口密码
	private String qqappid;//qq第三方登录
	private String wuliukey;//物流key
	private String wuliu_url;
	private String wuliu_acc;
	private String wuliu_pwd;
	private String fanli_max_num;//允许返利最大层数
	private String fanli_sys_profit;//平台利润
	private int fanli_after_time;//返利推迟时间
	private String extend_money;//满消费额开启二维码推广功能
	private String access_token;//密钥
	private String access_token_distime;//密钥过期时间
	private String mngurl;//后台管理域名
	private String mng_path;//后台文件根目录
	private String tel_fmt;//短信格式
	private String email_fmt;//邮件格式
	private String alipay_email;
	private String alipay_pid;
	private String alipay_key;
	private String alipay_url;
	private String wxgz_name;
	private String wxgz_acc;
	private String wxgz_oid;
	private String wxgz_url;
	private String wxgz_appid;
	private String wxgz_mchid;
	private String wxgz_key;
	private String wxgz_appsecret;
	private String is_buy;
	private String is_buy_tips;
	private String pv_rate;//pv兑换人名币的比例
	private String pv_card;//消费期权卡单张PV额度
	private String qq;
	
	public String getWuliu_url() {
		return wuliu_url;
	}

	public void setWuliu_url(String wuliuUrl) {
		wuliu_url = wuliuUrl;
	}

	public String getWuliu_acc() {
		return wuliu_acc;
	}

	public void setWuliu_acc(String wuliuAcc) {
		wuliu_acc = wuliuAcc;
	}

	public String getWuliu_pwd() {
		return wuliu_pwd;
	}

	public void setWuliu_pwd(String wuliuPwd) {
		wuliu_pwd = wuliuPwd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMngurl() {
		return mngurl;
	}

	public void setMngurl(String mngurl) {
		this.mngurl = mngurl;
	}

	public String getMng_path() {
		return mng_path;
	}

	public void setMng_path(String mng_path) {
		this.mng_path = mng_path;
	}

	public String getTel_fmt() {
		return tel_fmt;
	}

	public void setTel_fmt(String tel_fmt) {
		this.tel_fmt = tel_fmt;
	}

	public String getEmail_fmt() {
		return email_fmt;
	}

	public void setEmail_fmt(String email_fmt) {
		this.email_fmt = email_fmt;
	}

	public String getAlipay_email() {
		return alipay_email;
	}

	public void setAlipay_email(String alipay_email) {
		this.alipay_email = alipay_email;
	}

	public String getAlipay_pid() {
		return alipay_pid;
	}

	public void setAlipay_pid(String alipay_pid) {
		this.alipay_pid = alipay_pid;
	}

	public String getAlipay_key() {
		return alipay_key;
	}

	public void setAlipay_key(String alipay_key) {
		this.alipay_key = alipay_key;
	}

	public String getAlipay_url() {
		return alipay_url;
	}

	public void setAlipay_url(String alipay_url) {
		this.alipay_url = alipay_url;
	}

	public String getWxgz_name() {
		return wxgz_name;
	}

	public void setWxgz_name(String wxgz_name) {
		this.wxgz_name = wxgz_name;
	}

	public String getWxgz_acc() {
		return wxgz_acc;
	}

	public void setWxgz_acc(String wxgz_acc) {
		this.wxgz_acc = wxgz_acc;
	}

	public String getWxgz_oid() {
		return wxgz_oid;
	}

	public void setWxgz_oid(String wxgz_oid) {
		this.wxgz_oid = wxgz_oid;
	}

	public String getWxgz_url() {
		return wxgz_url;
	}

	public void setWxgz_url(String wxgz_url) {
		this.wxgz_url = wxgz_url;
	}

	public String getWxgz_appid() {
		return wxgz_appid;
	}

	public void setWxgz_appid(String wxgz_appid) {
		this.wxgz_appid = wxgz_appid;
	}

	public String getWxgz_mchid() {
		return wxgz_mchid;
	}

	public void setWxgz_mchid(String wxgz_mchid) {
		this.wxgz_mchid = wxgz_mchid;
	}

	public String getWxgz_key() {
		return wxgz_key;
	}

	public void setWxgz_key(String wxgz_key) {
		this.wxgz_key = wxgz_key;
	}

	public String getWxgz_appsecret() {
		return wxgz_appsecret;
	}

	public void setWxgz_appsecret(String wxgz_appsecret) {
		this.wxgz_appsecret = wxgz_appsecret;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String accessToken) {
		access_token = accessToken;
	}

	public String getAccess_token_distime() {
		return access_token_distime;
	}

	public void setAccess_token_distime(String accessTokenDistime) {
		access_token_distime = accessTokenDistime;
	}

	public String getExtend_money() {
		return extend_money;
	}

	public void setExtend_money(String extendMoney) {
		extend_money = extendMoney;
	}

	public String getFanli_max_num() {
		return fanli_max_num;
	}

	public void setFanli_max_num(String fanliMaxNum) {
		fanli_max_num = fanliMaxNum;
	}

	public String getFanli_sys_profit() {
		return fanli_sys_profit;
	}

	public void setFanli_sys_profit(String fanliSysProfit) {
		fanli_sys_profit = fanliSysProfit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getApk_url() {
		return apk_url;
	}

	public void setApk_url(String apkUrl) {
		apk_url = apkUrl;
	}

	public String getIpa_url() {
		return ipa_url;
	}

	public void setIpa_url(String ipaUrl) {
		ipa_url = ipaUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcp() {
		return icp;
	}

	public void setIcp(String icp) {
		this.icp = icp;
	}

	public String getQr() {
		return qr;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}

	public String getReg_mail() {
		return reg_mail;
	}

	public void setReg_mail(String regMail) {
		reg_mail = regMail;
	}

	public String getReg_mail_host() {
		return reg_mail_host;
	}

	public void setReg_mail_host(String regMailHost) {
		reg_mail_host = regMailHost;
	}

	public String getReg_mail_pwd() {
		return reg_mail_pwd;
	}

	public void setReg_mail_pwd(String regMailPwd) {
		reg_mail_pwd = regMailPwd;
	}

	public String getReg_tel() {
		return reg_tel;
	}

	public void setReg_tel(String regTel) {
		reg_tel = regTel;
	}

	public String getReg_tel_url() {
		return reg_tel_url;
	}

	public void setReg_tel_url(String regTelUrl) {
		reg_tel_url = regTelUrl;
	}

	public String getReg_tel_pwd() {
		return reg_tel_pwd;
	}

	public void setReg_tel_pwd(String regTelPwd) {
		reg_tel_pwd = regTelPwd;
	}

	public String getQqappid() {
		return qqappid;
	}

	public void setQqappid(String qqappid) {
		this.qqappid = qqappid;
	}

	public String getWuliukey() {
		return wuliukey;
	}

	public void setWuliukey(String wuliukey) {
		this.wuliukey = wuliukey;
	}
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getIs_buy() {
		return is_buy;
	}

	public void setIs_buy(String is_buy) {
		this.is_buy = is_buy;
	}

	public String getIs_buy_tips() {
		return is_buy_tips;
	}

	public void setIs_buy_tips(String is_buy_tips) {
		this.is_buy_tips = is_buy_tips;
	}

	public String getPv_rate() {
		return pv_rate;
	}

	public void setPv_rate(String pv_rate) {
		this.pv_rate = pv_rate;
	}

	public String getPv_card() {
		return pv_card;
	}

	public void setPv_card(String pv_card) {
		this.pv_card = pv_card;
	}

	public int getFanli_after_time() {
		return fanli_after_time;
	}

	public void setFanli_after_time(int fanli_after_time) {
		this.fanli_after_time = fanli_after_time;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
}
