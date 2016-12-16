package com.wang.oop.demo1;

public class Bird extends Animal{

	public Bird(String type) {
		super(type);
	}
	
	public void fly(){
		System.out.println(getType() + ",我可以飞翔");
	}
	
	@Override
	public void eat() {
		System.out.println(getType() + ",我吃虫子");
	}
	
	@Override
	public void sleep() {
		System.out.println(getType() + ",我蹲着睡觉");
	}

}
