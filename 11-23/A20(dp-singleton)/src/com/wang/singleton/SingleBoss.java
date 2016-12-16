package com.wang.singleton;

/**
 * SingleBoss类。
 * 
 * 单例模式。
 */
public class SingleBoss {

	// 属性
	private String name = "";
	private String gender = "";

	private static SingleBoss instance = null;

	// 构造
	private SingleBoss(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public static SingleBoss getInstance() {

		if (instance == null) {
			instance = new SingleBoss("", "");
		}

		return instance;
	}

	// 方法
	public void init(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public void work() {
		System.out.println(name + ",正在工作！");
	}

	public void intro() {
		System.out.println("name:" + name + ",gender:" + gender);
	}

}
