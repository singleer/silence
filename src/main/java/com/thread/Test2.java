package com.thread;

/**
 * final使用
 */
public class Test2 {

	public static void main(String[] args) {
		String a = "hello2";
		final String b = "hello";
		String d = "hello";
		String c = b + 2;
		String e = d + 2;
		String f = "hello" + 2;
		System.out.println(c);
		System.out.println(e);
		System.out.println((a == c));
		System.out.println((a == e));
		System.out.println((a == f));

		int i = 0;
		Test2 test2 = new Test2();
		test2.changeValue(i);
		System.out.println("i=" + i);

	}

	public void changeValue(int i){
		i++;
		System.out.println("局部变量" + i);
	}
}
