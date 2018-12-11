package com.duck;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 15:26
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
