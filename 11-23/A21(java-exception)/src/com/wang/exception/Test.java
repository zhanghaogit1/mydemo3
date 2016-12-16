package com.wang.exception;

public class Test {

	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1();
//		demo1.exception1();
//		demo1.exception2();
		
		Demo2 demo2 = new Demo2();
//		demo2.exception1();
//		demo2.exception2();
//		demo2.exception3();
//		demo2.exception4();
		
		Demo3 demo3 = new Demo3();
//		try {
//			demo3.exception1();
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
//		int avg = 0;
//		try {
//			avg = demo3.avg();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("avg=" + avg);
		
		Student s = new Student("张三");
		try {
			s.study(1);
		} catch (StudentException1 | StudentException3 | StudentException2 e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	

}
