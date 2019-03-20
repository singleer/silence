package com.thread.march;

import java.util.HashMap;

public class StudentTest {


	static int value = 33;

	public static void main(String[] args) throws Exception {
		new StudentTest().printValue();

		String str = "     ";
		String trim = str.trim();
		System.out.println(trim.equals(""));

		String a = "123";
		String b = "123";
		System.out.println(a==b);
		HashMap<String,String> map = new HashMap<>();
		map.put(new String("aaa"),"111");
		map.put(new String("aaa"),"221");
		System.out.println(map.size());
		System.out.println(map);

		String str1 = new String("aaa");
		String str2 = new String("aaa");
		System. out. println(String. format("str1：%d | str2：%d",  str1. hashCode(),str2. hashCode()));
		System. out. println(str1.equals(str2));

	}

	private void printValue() {
		int value = 3;
		System.out.println(value);
		System.out.println(this.value);
	}

}
