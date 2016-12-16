package com.wang.oop.demo1;

public class Cat extends Animal{

	public Cat(String type) {
		super(type);
	}
	
	public void catchCat(){
		System.out.println(getType() + ",我可以捉老鼠");
	}
	
	@Override
	public void eat() {
		System.out.println(getType() + ",我吃老鼠");
	}
	
	@Override
	public void sleep() {
		System.out.println(getType() + ",我蜷着睡觉");
	}
}
