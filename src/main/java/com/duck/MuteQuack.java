package com.duck;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 15:28
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
