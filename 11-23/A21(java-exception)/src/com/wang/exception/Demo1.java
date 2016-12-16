package com.wang.exception;

/**
 * 引入异常。
 *
 */
public class Demo1 {

	/**
	 * 除数为0。
	 */
	public void exception1() {
		// 除法运算
		int a = 10;
		int b = 0;

		// 计算
		int c = a / b;

		// 结果
		System.out.println("c=" + c);

		/*
		 * 代码正常，但是除法运算中，除数不能为0，如果不做处理， 代码无法处理这种情况， 程序只能被迫终止，造成无法获得结果。
		 */
	}

	/**
	 * 下标越界。
	 */
	public void exception2() {
		// 定义
		int[] arr = { 1, 2, 3 };

		// 操作
		int a = arr[3];

		// 结果
		System.out.println("a=" + a);

		/*
		 * 代码正常，数组操作中，代码会按照下标进行计算，但是无法排除错误的下标，错误的小标会引起代码提前终止。
		 */
	}

}
