package com.concurrent;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}
	//重写run方法
	public void run(){
		for (int i = 0; i < 10000; i++) {
			//该getName()方法来自父亲
			System.out.println(getName()+i);
		}
	}

}
