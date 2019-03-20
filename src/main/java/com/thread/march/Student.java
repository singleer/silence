package com.thread.march;

public class Student {

	private static String name;

	private int age;


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void speak(String str) {
		System.out.println(str);
	}
}
