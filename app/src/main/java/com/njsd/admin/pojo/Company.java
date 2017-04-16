/*
 * @(#) Company.java 2014-12-2
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Company.java
 * @author zhulm 2014-12-2
 * @version 1.0
 */
public class Company extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String c_id;//编号
	private String name;//企业名称
	private String user_id;//会员ID
	private String email;//邮箱
	private String tel;//联系电话
	private String code;//组织机构代码
	private String body;//公司简介
	private String img;//营业执照
	private String provinceid;//省id
	private String province;//省
	private String cityid;//市id
	private String city;//市
	private String countyid;//区id
	private String county;//区
	private String address;//地址
	private String a_date;
	private String a_id;
	private String u_date;
	private String u_id;
	private String flag;//是否显示
	private String f_id;
	private String status;//是否认证
	private String remark;//失败原因
	private String s_id;
	private String groupid;
	private String ishot;
	private String fm;
	private String lxr;
	private String title;
	private String stitle;
	private String about;
	private String hf1;
	private String hf2;
	private String hf3;
	private String dengji;//经销商等级
	private String bilizhi;//经销商价格比例值
	private String yzcode;
	private String comurl;
	private String lx;
	private String sctp;
	private String yssm;
	private String hjjs;
	
	private Admin a_adm;
	private Admin u_adm;
	private Admin f_adm;
	private Admin s_adm;
	private String isorder;
	
	public String getSctp() {
		return sctp;
	}
	public void setSctp(String sctp) {
		this.sctp = sctp;
	}
	public String getYssm() {
		return yssm;
	}
	public void setYssm(String yssm) {
		this.yssm = yssm;
	}
	public String getHjjs() {
		return hjjs;
	}
	public void setHjjs(String hjjs) {
		this.hjjs = hjjs;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	public String getYzcode() {
		return yzcode;
	}
	public void setYzcode(String yzcode) {
		this.yzcode = yzcode;
	}
	public String getComurl() {
		return comurl;
	}
	public void setComurl(String comurl) {
		this.comurl = comurl;
	}
	public String getLxr() {
		return lxr;
	}
	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStitle() {
		return stitle;
	}
	public void setStitle(String stitle) {
		this.stitle = stitle;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getHf1() {
		return hf1;
	}
	public void setHf1(String hf1) {
		this.hf1 = hf1;
	}
	public String getHf2() {
		return hf2;
	}
	public void setHf2(String hf2) {
		this.hf2 = hf2;
	}
	public String getHf3() {
		return hf3;
	}
	public void setHf3(String hf3) {
		this.hf3 = hf3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getIshot() {
		return ishot;
	}
	public void setIshot(String ishot) {
		this.ishot = ishot;
	}
	public String getFm() {
		return fm;
	}
	public void setFm(String fm) {
		this.fm = fm;
	}
	public String getIsorder() {
		return isorder;
	}
	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String cId) {
		c_id = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	public String getCountyid() {
		return countyid;
	}
	public void setCountyid(String countyid) {
		this.countyid = countyid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String aDate) {
		a_date = aDate;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String aId) {
		a_id = aId;
	}
	public String getU_date() {
		return u_date;
	}
	public void setU_date(String uDate) {
		u_date = uDate;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String uId) {
		u_id = uId;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String fId) {
		f_id = fId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String sId) {
		s_id = sId;
	}
	public Admin getA_adm() {
		return a_adm;
	}
	public void setA_adm(Admin aAdm) {
		a_adm = aAdm;
	}
	public Admin getU_adm() {
		return u_adm;
	}
	public void setU_adm(Admin uAdm) {
		u_adm = uAdm;
	}
	public Admin getF_adm() {
		return f_adm;
	}
	public void setF_adm(Admin fAdm) {
		f_adm = fAdm;
	}
	public Admin getS_adm() {
		return s_adm;
	}
	public void setS_adm(Admin sAdm) {
		s_adm = sAdm;
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
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getDengji() {
		return dengji;
	}
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	public String getBilizhi() {
		return bilizhi;
	}
	public void setBilizhi(String bilizhi) {
		this.bilizhi = bilizhi;
	}
}

