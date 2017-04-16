/*
 * @(#) Member.java 2014-11-12
 * 
 * Copyright 2015© 南京硕德信息技术有限公司, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Member.java
 * @author zhulm 2014-11-12
 * @version 1.0
 */
public class Member extends BaseBean {
	private static final long serialVersionUID = 8508949260034134406L;
	private String id; // 自动编号
	private String user_id;// 唯一编号
	private String u_account;// 用户名
	private String u_pwd;// 密码
	private String pay_pwd;// 支付密码
	private String u_name;// 真实姓名
	private String u_img;// 头像
	private String u_sex;// 性别
	private String u_birthday;// 出生日期
	private String u_email; // 邮箱
	private String u_phone;// 电话
	private String b_date; // 添加日期
	private String e_date; // 截止日期
	private String u_know; // 隐私设置
	private String u_flag;// 审核状态
	private String groupid;// 分站编号
	private String lang_id; // 语言编号
	private String puser_id; //上级id
	private String reg_from;//注册来源，0网页自己注册，1微站注册，2网页后台管理生成，3会员推荐
	private String u_grade;//售货商 0普通 1申请中 2申请成功3申请失败
	private String u_classification;// 会员分类
	private String identity;//身份证号码
	private String id_front_img;//身份证照-正面
	private String id_rear_img;//身份证照-反面
	private String com_id;//公司编号
	private String countryid;//国家id
	private String provinceid;//省id
	private String cityid;//市id
	private String countyid;// 区/县
	private String u_role;//会员类型
	private String u_hot;//热点
	private String u_new;//最新
	private String u_recommend;//推荐
	private String assistantid;//助理id
	private String ass_date;
	private String is_black;//拉黑
	
	private String company; //公司
	private String position; //职务
	private String marry;//婚姻状况
	private String u_study;//学历
	private String income;//收入
	private String workyear;//工龄
	private String nickname;//昵称
	private String credit;//积分
	private String puid;//推荐人
	private String erweima;//二维码内容
	private String erweima_img;//二维码图片
	private String car;
	
	private String t_code;//推广码
	private String tg_id;//推广人
	private String st_id;//自动编号，随时间产生，唯一
	private String pv;//用户pv积分
	private String pv_level;//pv等级（显示的等级，非实时）
	private String pv_level_hide;//pv等级（实时的pv等级）
	private String pv_cardnum;//vip等级对应卡的总数
	private String pv_cardnum_sell;//已卖出的卡数
	private String pv_residue;//剩余的卡的PV值
	private String pv_group;//团购套餐总额
	private String pv_num;//下级会员总数
	

	/**虚拟字段**/
	private String u_pwdc;
	private String country;//国家
	private String province;//省
	private String city;//市
	private String county;// 区/县
	private String u_oldpwd;//旧密码
	private String u_newpwd;//新密码
	private String u_address;// 地址
	private String email_phone;//邮箱或手机
	private String verifyCode;//验证码
	private String safe_identity;//*号保护的身份证号码
	private String safe_phone;//*号保护的手机号码
	private String isorder;
	private String puname;
	private String performance;//月总业绩
	private String daterange;//期数
	private String mMoney;//月提成
	private String mpStr;//月度 业绩金额转换公式
	private String yPerformance;//年度业绩
	private String yMoney;//年度提成
	private String u_wechat;
	private String money;
	private String paymoney;
	private String openid;
	private String totalMoney;
	private Param vip;
	private Member puser;
	private String fanliMoney;
	private String extendNum;
	private String studyMoney;//学习币
	private String is_active;//是否激活  0:未激活 1:已激活
	private String auto_shouyi;//0：手动收益 1：自动收益
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getPay_pwd() {
		return pay_pwd;
	}
	public void setPay_pwd(String pay_pwd) {
		this.pay_pwd = pay_pwd;
	}
	public String getPaymoney() {
		return paymoney;
	}
	public void setPaymoney(String paymoney) {
		this.paymoney = paymoney;
	}
	public String getExtendNum() {
		return extendNum;
	}
	public void setExtendNum(String extendNum) {
		this.extendNum = extendNum;
	}
	public String getFanliMoney() {
		return fanliMoney;
	}
	public void setFanliMoney(String fanliMoney) {
		this.fanliMoney = fanliMoney;
	}
	public Member getPuser() {
		return puser;
	}
	public void setPuser(Member puser) {
		this.puser = puser;
	}
	public String getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	public Param getVip() {
		return vip;
	}
	public void setVip(Param vip) {
		this.vip = vip;
	}
	public String getErweima() {
		return erweima;
	}
	public void setErweima(String erweima) {
		this.erweima = erweima;
	}
	public String getErweima_img() {
		return erweima_img;
	}
	public void setErweima_img(String erweima_img) {
		this.erweima_img = erweima_img;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	private String yinname;//隐藏的名字 
	
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
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String uAccount) {
		u_account = uAccount;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String uPwd) {
		u_pwd = uPwd;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String uName) {
		u_name = uName;
	}
	public String getU_img() {
		return u_img;
	}
	public void setU_img(String uImg) {
		u_img = uImg;
	}
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String uSex) {
		u_sex = uSex;
	}
	public String getU_birthday() {
		return u_birthday;
	}
	public void setU_birthday(String uBirthday) {
		u_birthday = uBirthday;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String uEmail) {
		u_email = uEmail;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String uPhone) {
		u_phone = uPhone;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String bDate) {
		b_date = bDate;
	}
	public String getE_date() {
		return e_date;
	}
	public void setE_date(String eDate) {
		e_date = eDate;
	}
	public String getU_know() {
		return u_know;
	}
	public void setU_know(String uKnow) {
		u_know = uKnow;
	}
	public String getU_flag() {
		return u_flag;
	}
	public void setU_flag(String uFlag) {
		u_flag = uFlag;
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
	public void setLang_id(String langId) {
		lang_id = langId;
	}
	public String getPuser_id() {
		return puser_id;
	}
	public void setPuser_id(String puserId) {
		puser_id = puserId;
	}
	public String getReg_from() {
		return reg_from;
	}
	public void setReg_from(String regFrom) {
		reg_from = regFrom;
	}
	public String getU_grade() {
		return u_grade;
	}
	public void setU_grade(String uGrade) {
		u_grade = uGrade;
	}
	public String getU_classification() {
		return u_classification;
	}
	public void setU_classification(String uClassification) {
		u_classification = uClassification;
	}
	public String getU_oldpwd() {
		return u_oldpwd;
	}
	public void setU_oldpwd(String uOldpwd) {
		u_oldpwd = uOldpwd;
	}
	public String getU_newpwd() {
		return u_newpwd;
	}
	public void setU_newpwd(String uNewpwd) {
		u_newpwd = uNewpwd;
	}
	public String getU_address() {
		return u_address;
	}
	public void setU_address(String uAddress) {
		u_address = uAddress;
	}
	public String getU_pwdc() {
		return u_pwdc;
	}
	public void setU_pwdc(String uPwdc) {
		u_pwdc = uPwdc;
	}
	public String getEmail_phone() {
		return email_phone;
	}
	public void setEmail_phone(String emailPhone) {
		email_phone = emailPhone;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public String getU_role() {
		return u_role;
	}
	public void setU_role(String uRole) {
		u_role = uRole;
	}
	public String getU_hot() {
		return u_hot;
	}
	public void setU_hot(String uHot) {
		u_hot = uHot;
	}
	public String getU_new() {
		return u_new;
	}
	public void setU_new(String uNew) {
		u_new = uNew;
	}
	public String getU_recommend() {
		return u_recommend;
	}
	public void setU_recommend(String uRecommend) {
		u_recommend = uRecommend;
	}
	public String getCountryid() {
		return countryid;
	}
	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountyid() {
		return countyid;
	}
	public void setCountyid(String countyid) {
		this.countyid = countyid;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getId_front_img() {
		return id_front_img;
	}
	public void setId_front_img(String idFrontImg) {
		id_front_img = idFrontImg;
	}
	public String getId_rear_img() {
		return id_rear_img;
	}
	public void setId_rear_img(String idRearImg) {
		id_rear_img = idRearImg;
	}
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String comId) {
		com_id = comId;
	}
	public String getSafe_identity() {
		return safe_identity;
	}
	public void setSafe_identity(String safeIdentity) {
		safe_identity = safeIdentity;
	}
	public String getSafe_phone() {
		return safe_phone;
	}
	public void setSafe_phone(String safePhone) {
		safe_phone = safePhone;
	}
	public String getAssistantid() {
		return assistantid;
	}
	public void setAssistantid(String assistantid) {
		this.assistantid = assistantid;
	}
	public String getAss_date() {
		return ass_date;
	}
	public void setAss_date(String assDate) {
		ass_date = assDate;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getIs_black() {
		return is_black;
	}
	public void setIs_black(String isBlack) {
		is_black = isBlack;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMarry() {
		return marry;
	}
	public void setMarry(String marry) {
		this.marry = marry;
	}
	public String getU_study() {
		return u_study;
	}
	public void setU_study(String u_study) {
		this.u_study = u_study;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getWorkyear() {
		return workyear;
	}
	public void setWorkyear(String workyear) {
		this.workyear = workyear;
	}
	public String getYinname() {
		return yinname;
	}
	public void setYinname(String yinname) {
		this.yinname = yinname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getPuid() {
		return puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}
	public String getPuname() {
		return puname;
	}
	public void setPuname(String puname) {
		this.puname = puname;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public String getDaterange() {
		return daterange;
	}
	public void setDaterange(String daterange) {
		this.daterange = daterange;
	}
	public String getmMoney() {
		return mMoney;
	}
	public void setmMoney(String mMoney) {
		this.mMoney = mMoney;
	}
	public String getMpStr() {
		return mpStr;
	}
	public void setMpStr(String mpStr) {
		this.mpStr = mpStr;
	}
	public String getyPerformance() {
		return yPerformance;
	}
	public void setyPerformance(String yPerformance) {
		this.yPerformance = yPerformance;
	}
	public String getyMoney() {
		return yMoney;
	}
	public void setyMoney(String yMoney) {
		this.yMoney = yMoney;
	}
	public String getU_wechat() {
		return u_wechat;
	}
	public void setU_wechat(String u_wechat) {
		this.u_wechat = u_wechat;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getT_code() {
		return t_code;
	}
	public void setT_code(String t_code) {
		this.t_code = t_code;
	}
	public String getTg_id() {
		return tg_id;
	}
	public void setTg_id(String tg_id) {
		this.tg_id = tg_id;
	}
	public String getSt_id() {
		return st_id;
	}
	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}
	public String getPv() {
		return pv;
	}
	public void setPv(String pv) {
		this.pv = pv;
	}
	public String getPv_level() {
		return pv_level;
	}
	public void setPv_level(String pv_level) {
		this.pv_level = pv_level;
	}
	public String getPv_level_hide() {
		return pv_level_hide;
	}
	public void setPv_level_hide(String pv_level_hide) {
		this.pv_level_hide = pv_level_hide;
	}
	public String getPv_cardnum() {
		return pv_cardnum;
	}
	public void setPv_cardnum(String pv_cardnum) {
		this.pv_cardnum = pv_cardnum;
	}
	public String getPv_cardnum_sell() {
		return pv_cardnum_sell;
	}
	public void setPv_cardnum_sell(String pv_cardnum_sell) {
		this.pv_cardnum_sell = pv_cardnum_sell;
	}
	public String getPv_residue() {
		return pv_residue;
	}
	public void setPv_residue(String pv_residue) {
		this.pv_residue = pv_residue;
	}
	public String getPv_group() {
		return pv_group;
	}
	public void setPv_group(String pv_group) {
		this.pv_group = pv_group;
	}
	public String getPv_num() {
		return pv_num;
	}
	public void setPv_num(String pv_num) {
		this.pv_num = pv_num;
	}
	public String getStudyMoney() {
		return studyMoney;
	}
	public void setStudyMoney(String studyMoney) {
		this.studyMoney = studyMoney;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getAuto_shouyi() {
		return auto_shouyi;
	}
	public void setAuto_shouyi(String auto_shouyi) {
		this.auto_shouyi = auto_shouyi;
	}
}

