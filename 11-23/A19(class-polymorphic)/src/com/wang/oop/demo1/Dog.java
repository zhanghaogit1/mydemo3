package com.wang.oop.demo1;

public class Dog extends Animal{

	public Dog(String type) {
		super(type);
	}
	
	public void catchCat(){
		System.out.println(getType() + ",我多管闲事");
	}
	
	@Override
	public void eat() {
		System.out.println(getType() + ",我吃骨头");
	}
	
	@Override
	public void sleep() {
		System.out.println(getType() + ",我趴着睡觉");
	}

}
