package com.wang.oop.demo2;


public class Boss extends AMember{

	public Boss(String name, String offer) {
		super(name, offer);
	}
	
	@Override
	public void work() {
		System.out.println(getName() + ":" + getOffer() + ",上班就是啥都不干");
	}
	
	@Override
	public void rest() {
		System.out.println(getName() + ":" + getOffer() + ",休息就是应酬");
	}

	
}
