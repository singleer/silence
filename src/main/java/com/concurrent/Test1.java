package com.concurrent;


public class Test1 {

	static Boolean flag = false;

	static int a = 0;

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				a = 1;
				flag = true;
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while (flag) {
					// 输出的number的值不一定是1
					System.out.println(a);
				}
			}
		});

		t1.start();
		t2.start();

	}
}
