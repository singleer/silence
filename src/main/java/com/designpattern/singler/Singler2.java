package com.designpattern.singler;

/**
 * @author 李祥华
 * @description
 * @time 2019/1/4 14:46
 *
 * 饿汉式
 */
public class Singler2 {
    private static Singler2 instance  = new Singler2();

    private Singler2(){

    }

    public static Singler2 getInstance(){

        return instance;
    }
}
