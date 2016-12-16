package com.wang.oop.demo1;

public class Animal {
	//属性
	private String type = "animal";
	
	//构造
	public Animal(String type) {
		this.type = type;
	}
	
	//方法
	public void eat(){
		System.out.println(type + ",吃");
	}

	public void sleep(){
		System.out.println(type + ",睡");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
