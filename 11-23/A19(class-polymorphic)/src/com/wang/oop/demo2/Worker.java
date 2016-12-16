package com.wang.oop.demo2;


public class Worker extends AMember{

	public Worker(String name, String offer) {
		super(name, offer);
	}
	
	@Override
	public void work() {
		System.out.println(getName() + ":" + getOffer() + ",上班就是干干干");
	}
	
	@Override
	public void rest() {
		System.out.println(getName() + ":" + getOffer() + ",休息就是睡睡睡");
	}

	
}
