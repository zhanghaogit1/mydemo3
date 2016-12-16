package com.wang.singleton;

/**
 * Boss类。
 * 
 * 普通类。
 *
 */
public class Boss {

	// 属性
	private String name = "";
	private String gender = "";

	// 构造
	public Boss(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	// 方法
	public void work() {
		System.out.println(name + ",在工作！");
	}

	public void intro() {
		System.out.println("name:" + name + ",gender:" + gender);
	}

}
