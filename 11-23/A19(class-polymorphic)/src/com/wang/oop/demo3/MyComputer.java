package com.wang.oop.demo3;

public class MyComputer implements USB {

	// 属性
	private String brand = "";
	private String hd = "empty";

	// 构造
	public MyComputer(String brand) {
		this.brand = brand;
	}

	// 方法
	public void edit() {
		System.out.println(brand + ",正在编辑文档！");
	}

	public void showHD() {
		System.out.println(brand + ",HD:" + hd);
	}

	@Override
	public void usbIn(String data) {
		System.out.println(brand + ",usb in:" + data);
		hd = data;
	}

	@Override
	public String usbOut() {
		System.out.println(brand + ",usb out:" + hd);
		return hd;
	}
}
