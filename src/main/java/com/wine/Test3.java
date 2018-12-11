package com.wine;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 14:00
 */
public class Test3 {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));//a a
        System.out.println("2--" + a1.show(c));//a a
        System.out.println("3--" + a1.show(d));//a d
        System.out.println("4--" + a2.show(b));//b a
        System.out.println("5--" + a2.show(c));//b a
        System.out.println("6--" + a2.show(d));//a d
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }
}
