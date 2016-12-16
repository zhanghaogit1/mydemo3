package com.wang.oop.demo2;


public class Manager extends AMember{

	public Manager(String name, String offer) {
		super(name, offer);
	}
	
	@Override
	public void work() {
		System.out.println(getName() + ":" + getOffer() + ",上班就是让下面人干");
	}
	
	@Override
	public void rest() {
		System.out.println(getName() + ":" + getOffer() + ",休息就是请领导吃饭");
	}

	
}
