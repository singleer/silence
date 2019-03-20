package com.jvm.classload.demo1;

public class ConstClass {

	static {
		System.out.println("ConstClass init!");
	}
	public static final int str = 123;
}
