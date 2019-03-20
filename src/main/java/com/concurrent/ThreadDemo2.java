package com.concurrent;


public class ThreadDemo2 implements Runnable {

	private Boolean flag;

	private int a;

	public ThreadDemo2(Boolean flag, int a){
		this.flag = flag;
		this.a = a;
	}



	@Override
	public void run() {

		while (flag) {
			// 输出的number的值不一定是1
			System.out.println(a);
		}
	}
}
