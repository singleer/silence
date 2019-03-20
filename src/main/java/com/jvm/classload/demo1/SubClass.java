package com.jvm.classload.demo1;

public class SubClass extends SuperClass {

	public SubClass(){
		System.out.println("SubClass construct");
	}
	static {
		System.out.println("SubClass init!");
	}
}
