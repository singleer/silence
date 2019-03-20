package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {

	public static volatile int race = 0;
//	public static AtomicInteger race = new AtomicInteger(0);
	public static void increase() {
		race++;
	}

	private static final int THREADS_COUNT = 20;
	static boolean flag = false;

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("线程1启动");
				while (!flag){
					System.out.println("hello world!");
				}
				if (flag){
					System.out.println(123);
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("线程2启动");
				flag = true;
			}
		});
		t1.start();
		t2.start();

	}
}
