package com.designpattern.duck;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 15:28
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
