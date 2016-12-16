package com.wang.demo;

import java.util.function.IntBinaryOperator;

/**
 * �о�if��switch,for,while (1)��ʽ (2)Ƕ�� (3)С����
 */
public class Demo2 {

	public void test1(int a, int b) {
		// ���
		int c = 0;
		// �������
		if (a == 0) {
			System.out.println("c=" + c);
			return;
		}

		// ����
		if (b != 0) {
			c = a / b;
		}

		// ���
		System.out.println("c=" + c);
	}

	public void test2(int a, int b) {
		int c = 0;

		if (b == 0) {
			System.out.println("��������Ϊ0");
		} else {
			c = a / b;
			System.out.println("c=" + c);
		}
	}

	public void test3(int income) {
		// �������
		if (income <= 0) {
			System.out.println("��������");
			return;
		}

		// ���
		String s = "xxx";

		// ����
		if (income <= 3000) {
			s = "С����";
		} else if (income <= 5000) {
			s = "С����";
		} else if (income <= 8000) {
			s = "����";
		} else if (income <= 10000) {
			s = "����";
		} else {
			s = "����";
		}

		// ���
		System.out.println("���룺" + income + ",�ײ㣺" + s);
	}

	public void test4(int gender, int age, int height) {

		// if (gender == 1) {
		// if (age < 30) {
		// if (height >= 180) {
		// System.out.println("�ϸ�");
		// }
		// }
		// }

		if (gender == 1 && age <= 30 && height > 180) {
			System.out.println("�ϸ�");
		}
	}

	public void test5(int a, int b, int c) {
		// �������
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("��������");
			return;
		}

		// �ж��Ƿ�������
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("���Թ���������");
		}

		// �ж��Ƿ�ֱ��
		if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
			System.out.println("���Թ���ֱ��������");
		}
		// �����ܳ�
		double cc = a + b + c;

		// �������
		double p = cc / 2;
		System.out.println("p=" + p);
		double temp = p*(p-a)*(p-b)*(p-c);
		double s = Math.sqrt(temp);

		// ���
		System.out.println("cc=" + cc);
		System.out.println("s=" + s);

	}

}
