package com.wang.oop.demo2;

public class Bank {
	
	//属性
	private String name = "";
	private int money = 0;

	//构造
	public Bank(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//方法
	//秀一下自己有多少钱
	public void show(){
		System.out.println(name + ",money:" + money);
	}
	//存钱
	public void in(int money){
		this.money += money;
		System.out.println("money:" + money);
	}
	//取钱
	public void out(int count){
//		money = money - count;
		money -= count;
		System.out.println("money:" + money);
	}
	//内部类 男工作人员
	public class Boy{
		//属性
		private String name="";
       //构造
		public Boy(String name) {
			this.name = name;
		}
		//方法
		public int outMoney(int count){
			
			money -= count;
			System.out.println("money:"+ money);
			return count;
		}
	}
	//内部类 女工作人员
	// 属性
	public class Girl{
		private String name="";
  //构造
		public Girl(String name) {
			this.name = name;
		}
		//方法
		public void inMoney(int count){
			money += count;
			System.out.println("money:"+ money);
		}
	}
}





