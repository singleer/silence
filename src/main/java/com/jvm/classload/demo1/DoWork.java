package com.jvm.classload.demo1;

public class DoWork {
	public static void main(String[] args) {
		boolean ok = false;
		int a = 0;

		// Thread a
		a = 1;
		ok = true;

		// Thread b
		// 可能一直循环下去
		while (ok) {
			// 输出的number的值不一定是1
			System.out.println(a);
		}
	}
}
