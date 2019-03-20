package com.jvm.classload.demo1;

public class SuperClass {
	public SuperClass(){
		System.out.println("SuperClass construct");
	}
	static {
		System.out.println("SuperClass init!");
	}
	public static final String value = "123";
}