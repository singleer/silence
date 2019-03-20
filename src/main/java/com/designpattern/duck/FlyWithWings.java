package com.designpattern.duck;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 15:07
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
