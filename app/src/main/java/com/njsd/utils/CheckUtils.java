/*
 * @(#) NumberUtils.java 2014-10-28
 * 
 * Copyright 2015© 南京硕德信息技术有限公司, All rights reserved.
 */

package com.njsd.utils;

/**
 * NumberUtils.java
 * 
 * @author zhulm 2014-10-28
 * @version 1.0
 */
public class CheckUtils {
	/**
	 * 判断字符串是否是整数
	 * 
	 * @param value
	 * @return true 是
	 * @author zhulm
	 */
	public static boolean isInteger(String value) {
		try {
			if(value != null){
				Long.parseLong(value);
				return true;
			}else{
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * 判断字符串是否是浮点数
	 * 
	 * @param value
	 * @return
	 * @author zhulm
	 */
	public static boolean isDouble(String value) {
		try {
			Double.parseDouble(value);
			if (value.contains(".")) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	/**
	 * 判断字符是否含有sql关键字
	 * @param value
	 * @return true:有
	 * @author zhulm
	 */
	public static boolean hasSqlChar(String value) {
		boolean flag = false;
		if(value !=null && !"".equals(value)){
			value = value.trim().toLowerCase();
			flag = value.contains("select") || value.contains("and") || value.contains("or") || value.contains("%") || 
			value.contains("from") || value.contains("count") || value.contains("concat") || value.contains("having") || 
			value.contains("in") || value.contains("where") || value.contains("union") || value.contains("all") || value.contains("null");
		}
		return flag;
	}
	
	/**
	 * 判断字符是否含有特殊符号
	 * @param value
	 * @return true:有
	 * @author zhulm
	 */
	public static boolean hasSpecialChar(String value) {
		boolean flag = false;
		if(value !=null && !"".equals(value)){
			value = value.trim().toLowerCase();
			flag = value.contains("%") || value.contains("*") || value.contains("&") || value.contains("|");
		}
		return flag;
	}
	
	public static boolean isNUllString(String str) {
		if(str==null || "".equals(str)){
			return true;
		}else{
			return false;
		}
	}
	
}
