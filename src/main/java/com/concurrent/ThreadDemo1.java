package com.concurrent;

public class ThreadDemo1 implements Runnable {

	private Boolean flag;

	private int a;

	public ThreadDemo1(Boolean flag, int a){
		this.flag = flag;
		this.a = a;
	}

	@Override
	public void run() {
		a = 1;
		flag = true;
	}
}
