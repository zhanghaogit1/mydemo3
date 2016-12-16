package com.wang.exception;

/**
 * 异常处理方式1。 try catch
 */
public class Demo2 {

	/**
	 * 除数为0。
	 */
	public void exception1() {
		// 除法运算
		int a = 10;
		int b = 0;
		int c = 0;

		// 计算(并处理异常)
		try {
			c = a / b;
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("程序发生异常！");
		}

		// 输出结果
		System.out.println("c=" + c);
	}

	/**
	 * 下标越界。
	 */
	public void exception2() {
		// 数据
		int[] arr = { 1, 2, 3 };
		int a = 0;

		// 处理
		try {
			a = arr[3];
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("程序异常！");
		}

		// 结果
		System.out.println("a=" + a);
	}

	/**
	 * try catch 研究。
	 */
	public void exception3() {

		int a = 10;
		int b = 0;
		int c = 0;

		try {
			c = a / b;

			System.out.println("程序正常！");
		} catch (Exception e) {
			c = Integer.MAX_VALUE;
			System.out.println("程序异常！");
		}finally{
			
			System.out.println("最终！");
		}

		System.out.println("c=" + c);
	}
	
	/**
	 * try catch 案例。
	 */
	public void exception4() {

		int a = 10;
		int b = 0;
		int c = 0;

		try {
			c = a / b;
			System.out.println("正常输出1，c=" + c);
			a = 20;
			b = 10;
			c = a / b;
			System.out.println("正常输出2，c=" + c);
		} catch (Exception e) {
			b = 3;
			c = a * b;
			System.out.println("异常输出，c=" + c);	
		}finally{
			c = a + b;
			System.out.println("最终输出，c=" + c);
		}

		System.out.println("程序结束");
	}
	
	

}
