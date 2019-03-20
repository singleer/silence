package com.concurrent;

public class Demo {

	public static void main(String[] args) {
		System.out.println("这里是main线程：");
		MyThread mt=new MyThread("小李");
		mt.start();//开启了一个新线程
		for (int i = 0; i < 10000; i++) {
			System.out.println("小明" + i);
		}
		String threadName = mt.getName();
		System.out.println("name" + threadName);
		Thread thread = mt.currentThread();
		System.out.println("thread :" + thread);

	}
}
