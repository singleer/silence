package com.duck;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 14:47
 */
public abstract class Duck {


    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }
}
