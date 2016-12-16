package com.wang.demo;

/**
 * 班级类： 属性：name，boss，student[] 方法：intro(),max(),min(),total(),avg(),sort()
 *
 */
public class MyClass {

	// 属性
	private String name;
	private String boss;
	private Student[] students;

	// 构造
	public MyClass(String name, String boss, Student[] students) {
		this.name = name;
		this.boss = boss;
		this.students = students;
	}

	// 方法
	public void intro() {
		// 结果
		String info = "";

		// 处理
		info += "name:" + name + "\n" + "boss:" + boss + "\n";
		System.out.println(info);

		for (Student s : students) {
			s.intro();
		}
		// 输出
		// System.out.println(info);
	}

	public void max() {
		int max = 0;

		for (Student s : students) {
			if (max < s.total()) {
				max = s.total();
			}
		}
		
		System.out.println("max:" + max);
	}

	public void min() {
		int min = 100;

		for (Student s : students) {
			if (min > s.total()) {
				min = s.total();
			}
		}
		
		System.out.println("min:" + min);
	}

	public int total() {
		int total = 0;
		for (Student s : students) {
			
			total += s.total();
		}
		
		System.out.println("total:" + total);
		return total;
	}

	public void avg() {
		int avg = 0;
		avg = total() / students.length; 
		System.out.println("avg:" + avg);
	}

	public void sort() {
		
		for (Student s : students) {
			System.out.println(s.getName());
		}
		//先写一个循环
		for (int j = 0; j < students.length-1; j++) {
			
			for (int i = 0; i < students.length-j-1; i++) {
				Student temp = null;
				if (students[i].total() < students[i+1].total()) {
					temp = students[i];
					students[i] = students[i+1];
					students[i+1] = temp;
				}
			}
			
		}
		
		
		for (Student s : students) {
			System.out.println(s.getName());
		}
	}
}





