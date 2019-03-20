package com.designpattern.singler;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * 内部类
 */
public class Singler4 {


	static class InnerClass {
		private final static Singler4 instance = new Singler4();
	}

	private Singler4(){}

	private static Singler4 getInstance(){
		return InnerClass.instance;
	}
}
