package com.wang.exception;

/**
 * 异常处理方式2。throw Exception
 *
 */
public class Demo3 {

	/**
	 * 抛出异常。
	 * 
	 * 计算过程如果存在意外情况，可直接抛到方法之外，由调用者处理。
	 * 
	 * @throws Exception
	 */
	public void exception1() throws Exception {
		// 数据
		int a = 10;
		int b = 0;
		int c = 0;

		// 抛出异常
		if (b == 0) {

			throw new Exception("divisor is zero!");
		}

		// 计算
		c = a / b;

		// 结果
		System.out.println("c=" + c);
	}

	/**
	 * 模拟异常。
	 * 
	 * 计算平均分。百分制，要排除负数成绩和大于100的成绩。
	 * 
	 * @throws Exception
	 */
	public int avg() throws Exception {
		// 数据
		int[] score = { 61, 65, 81, 97, 75, -66, 85, 77, 822, 55 };

		// 计算
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] < 0) {
				throw new Exception("score < 0");
			} else if (score[i] > 100) {
				throw new Exception("score > 100");
			} else {
				sum += score[i];
				System.out.println(i + "次，sum=" + sum);
			}
		}
		int avg = sum / 10;

		// 结果
		System.out.println("sum=" + sum);
		
		return avg;
	}

}
