package com.wang.singleton;


public class Test {

	public static void main(String[] args) {
		
		//三个Boss引用，三个boss对象
		Boss b1 = new Boss("boss1", "male");
		Boss b2 = new Boss("boss2", "female");
		Boss b3 = new Boss("boss3", "female");
		
		//对象属性各不相同
		b1.intro();
		b2.intro();
		b3.intro();
		
		//对象地址各不相同
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		//三个Boss引用，一个boss对象
		SingleBoss b4 = SingleBoss.getInstance();
		b4.init("boss4", "male");
		SingleBoss b5 = SingleBoss.getInstance();
		SingleBoss b6 = SingleBoss.getInstance();
		
		//对象属性相同
		b4.intro();
		b5.intro();
		b6.intro();
		
		//对象地址相同
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
		/*
		 * 单例模式，通过一定技术手段，保证一个类，只能创建一个对象（单个实例，单例）。
		 * 
		 */
	}
}






