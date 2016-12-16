package com.wang.exception;

/**
 * 学生类。 
 *
 * 测异常。
 */
public class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}
	
	public void study(int hour) throws StudentException1, StudentException3, StudentException2{
		
		if (hour >= 4) {
			throw new StudentException3();
		}else if (hour >= 3) {
			throw new StudentException2();
		}else if (hour >= 2) {
			throw new StudentException1();
		}else {
			System.out.println(name + ":我爱北京天安门，我为祖国做贡献，我要美好生活");
		} 
		
	}
}












