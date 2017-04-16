/*
 * @(#) BaseBean.java 2013-8-26
 * 
 * Copyright 2015© 北京铸信至诚, All rights reserved.
 */
package com.njsd.base.pojo;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 定义基础数据信息传输 本系统所有用于数据传输的JavaBean都必须继承BaseBean
 * 
 * @author zhulm
 * @version v1.0.0
 */
public class BaseBean implements Serializable {
	private static final long serialVersionUID = 609392925037215528L;
	private String isorder;
	private String islimit;
	private String adate;
	private String aadm;
	private String aadmname;
	private String udate;
	private String uadm;
	private String uadmname;

	@Override
	public String toString() {
		// 获取所有变量信息
		Field[] field = this.getClass().getDeclaredFields();
		StringBuffer str = new StringBuffer("{");
		int length = field.length;
		for (int i = 0; i < field.length; i++) {
			// 单一安全性检查
			field[i].setAccessible(true);
			try {
				if (field[i].getName().equals("serialVersionUID")) {
					continue;
				} else if (field[i].getName().equals("pageResult")) {
					continue;
				} else if (field[i].getName().equals("queryStartDate")) {
					continue;
				} else if (field[i].getName().equals("queryEndDate")) {
					continue;
				}
				str.append(field[i].getName());
				str.append(":");
				if (field[i].getType().getName().indexOf("Map") != -1) {
					str.append("{}");
				} else if ((field[i].getType().isInterface() || field[i]
						.getType().isArray())
						&& field[i].get(this) == null) {
					str.append("[]");
				} else if (field[i].get(this) != null) {
					str.append("\""
							+ (field[i].get(this)).toString().replaceAll("\"",
									"\\\\\"") + "\"");
				} else {
					str.append("\"" + field[i].get(this) + "\"");
				}
				if (i + 1 < length) {
					str.append(",");
				}
			} catch (IllegalArgumentException e) {
				return "toString方法中获取变量值时发生异常！";
			} catch (IllegalAccessException e) {
				return "toString方法中获取变量值时发生异常！";
			}
		}
		str.append("}");
		return str.toString().replaceAll("\"\"null\"\"", "\"\"").replaceAll(
				"\"\\[", "\\[").replaceAll("\\]\"", "\\]").replaceAll("\"\\{",
				"\\{").replaceAll("\\}\\}\"", "\\}\\}");
	}

	/**
	 * 根据实例对象属性名称获取属性值
	 * 
	 * @param propertyName
	 *            属性名
	 * @return
	 * @author zhulm
	 */
	public Object getPropertyValue(String propertyName) {
		try {
			// 获取属性变量
			Field field = this.getClass().getDeclaredField(propertyName);
			// 安全性检查
			field.setAccessible(true);
			// 获取属性值
			return field.get(this);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据实例对象属性名称设置属性值
	 * 
	 * @param propertyName
	 *            属性名
	 * @param propertyValue
	 *            属性值
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @author zhulm
	 */
	public void setPropertyValue(String propertyName, Object propertyValue)
			throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		// 获取属性设置方法名称
		String methodName = "set" + propertyName.substring(0, 1).toUpperCase()
				+ propertyName.substring(1);
		// 获取Set方法
		Method method = this.getClass().getDeclaredMethod(methodName,
				new Class[] { propertyValue.getClass() });
		// 设值
		method.invoke(this, propertyValue);
	}

	public String getIsorder() {
		return isorder;
	}

	public void setIsorder(String isorder) {
		this.isorder = isorder;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		this.adate = adate;
	}

	public String getAadm() {
		return aadm;
	}

	public void setAadm(String aadm) {
		this.aadm = aadm;
	}

	public String getAadmname() {
		return aadmname;
	}

	public void setAadmname(String aadmname) {
		this.aadmname = aadmname;
	}

	public String getUdate() {
		return udate;
	}

	public void setUdate(String udate) {
		this.udate = udate;
	}

	public String getUadm() {
		return uadm;
	}

	public void setUadm(String uadm) {
		this.uadm = uadm;
	}

	public String getUadmname() {
		return uadmname;
	}

	public void setUadmname(String uadmname) {
		this.uadmname = uadmname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIslimit() {
		return islimit;
	}

	public void setIslimit(String islimit) {
		this.islimit = islimit;
	}
	
}
