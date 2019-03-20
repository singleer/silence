package com.designpattern.duck;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 15:31
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
