/*
 * @(#) AccessToken.java 2015-10-26
 */

package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * AccessToken.java
 * 微信服务器会返回json格式的数据：{"access_token":"ACCESS_TOKEN","expires_in":7200}
 * @author zhulm 2015-10-26
 * @version 1.0
 */
public class AccessToken extends BaseBean {
	private static final long serialVersionUID = 2948003917796864043L;
	private String token;
	private int expiresIn;
	/**
	 *  获取到的凭证
	 */
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 *  凭证有效时间，单位：秒
	 */
	public int getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
}
