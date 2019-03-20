package com.designpattern.duck;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 15:30
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
