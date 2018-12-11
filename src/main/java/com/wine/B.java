package com.wine;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 13:59
 */
public class B extends A {

    public String show(B obj){
        return ("B and B");
    }

    @Override
    public String show(A obj){
        return ("B and A");
    }
}
