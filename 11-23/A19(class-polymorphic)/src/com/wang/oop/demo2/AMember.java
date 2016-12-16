package com.wang.oop.demo2;

public abstract class AMember {

	public static final String OFFER_BOSS = "boss";
	public static final String OFFER_MANAGER = "manager";
	public static final String OFFER_WORKER = "worker";

	// 属性
	private String name = "";
	private String offer = "";
	

	// 构造
	public AMember(String name, String offer) {
		this.name = name;
		this.offer = offer;
	}

	// 方法
	public void work(){
		System.out.println(getName() + ":" + getOffer() + ",上班");
	}
	
	public void rest(){
		System.out.println(getName() + ":" + getOffer() + ",休息");
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOffer() {
		return offer;
	}


	public void setOffer(String offer) {
		this.offer = offer;
	}
}
