package com.wang.exception;

/**
 * 自定义异常。
 *
 */
public class StudentException2 extends Exception{

	private static final long serialVersionUID = 1L;
	
	public StudentException2() {
		super("我坐不了这么久");
	}

}
