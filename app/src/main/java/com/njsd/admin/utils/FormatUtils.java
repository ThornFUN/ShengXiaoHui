/*
 * @(#)FormatUtils.java  2013-9-25
 * 
 * Copyright 2013© 北京铸信至诚, All rights reserved.
 */
package com.njsd.admin.utils;

import java.text.DecimalFormat;

/**
 * 格式化辅助类
 *
 * @author zhulm
 * @version v2.0.0
 */
public class FormatUtils {
	
	/**
	 * 将数字格式化为3位用逗号分隔并舍去小数位
	 *
	 * @param number
	 * @return
	 * @author zhulm
	 */
	public static String split(double number) {
		DecimalFormat f = new DecimalFormat("#,###");
		return f.format(number);
	}
	
	/**
	 * 将数字格式化为3位用逗号分隔并保留2位小数
	 * @param number
	 * @return
	 * @author zhulm
	 */
	public static String split2(double number) {
		DecimalFormat f = new DecimalFormat("#,###.##");
		return f.format(number);
	}
	
	/**
	 * 将数字格式化为3位用逗号分隔并舍去小数位
	 *
	 * @param number
	 * @return
	 * @author zhulm
	 */
	public static String split(int number) {
		DecimalFormat f = new DecimalFormat("#,###");
		return f.format(number);
	}
	
	/**
	 * 将数字格式化为3位用逗号分隔并舍去小数位
	 *
	 * @param number
	 * @return
	 * @author zhulm
	 */
	public static String split(long number) {
		DecimalFormat f = new DecimalFormat("#,###");
		return f.format(number);
	}
	
	/**
	 * 将数字格式化为3位用逗号分隔并舍去小数位
	 *
	 * @param number
	 * @return
	 * @author zhulm
	 */
	public static String split(float number) {
		DecimalFormat f = new DecimalFormat("#,###");
		return f.format(number);
	}
	
	/**
	 * 字符串带*保护
	 * @param id 字符串
	 * @param b_num 头部保留字符位数
	 * @param e_num 尾部保留字符位数
	 * @return
	 * @author zhulm
	 */
	public static String safeId(String id,int b_num,int e_num){
		if(id!=null && !"".equals(id) && b_num>0 && e_num>=0){
			int len = id.length();
			if(len<=b_num+e_num){
				return id;
			}else{
				String safeid = "";
				safeid += id.substring(0,b_num);
				for(int i=0;i<len-b_num-e_num;i++){
					safeid += "*";
				}
				safeid += id.substring(len-e_num,len);
				return safeid;
			}
		}else{
			return id;
		}
	}
	
	/**
	 * 去除字符串尾部的0和.
	 *
	 * @param number
	 * @return
	 * @author xull
	 */
	public static String delZero(String number) {
		if(number.contains(".")) {
			if(number.endsWith("0") || number.endsWith(".")) {
				return delZero(number.substring(0, number.length() - 1));
			}
		}
		return number;
	}
	
	/**
	 * sql变量加''并拼接,处理
	 * @param str
	 * @return 123 --> '123',
	 * @author zlm
	 */
	public static String toSqlChar(String str){
		if(str != null){
			if(str == ""){
				str = "null,";
			}else{
				str = "'" + str + "',";
			}
		}
		return str;
	}
	
	/**
	 * sql变量加'' 处理
	 * @param str
	 * @return 123 --> '123'
	 * @author zlm
	 */
	public static String toSqlCharNoend(String str){
		if(str != null){
			if(str == ""){
				str = "null,";
			}else{
				str = "'" + str + "'";
			}
		}
		return str;
	}
	
	/**
	 * 保留2位小数
	 * @param number
	 * @return
	 * @author zhulm
	 */
	public static double split3(double number) {
		if(number == 0){
			return 0;
		}else{
			DecimalFormat f = new DecimalFormat("#.##");
			return Double.parseDouble(f.format(number));
		}
	}
}
