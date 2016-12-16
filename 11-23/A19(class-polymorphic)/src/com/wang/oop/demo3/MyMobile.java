package com.wang.oop.demo3;

public class MyMobile implements USB{
	
	//属性
	private String brand = "";
	private String sd = "美丽照片";

	//构造
	public MyMobile(String brand) {
		this.brand = brand;
	}
	
	//方法
	public void call(){
		System.out.println(brand + ",正在通话！");
	}
	
	public void takePhoto(String photo){
		System.out.println(brand + ",take photo:" + photo);
		sd = photo;
	}
	
	public void showSD(){
		System.out.println(brand + ",SD:" + sd);
	}

	@Override
	public void usbIn(String data) {
		System.out.println(brand + ",usb in:" + data);
		sd = data;
	}

	@Override
	public String usbOut() {
		System.out.println(brand + ",usb out:" + sd);
		return sd;
	}
	
}










