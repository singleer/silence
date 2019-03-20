package com.designpattern.singler;

/**
 * @author 李祥华
 * @description
 * @time 2019/1/4 14:42
 */
public class Singler1 {

    private static Singler1 instance;

    private Singler1(){

    }

    /**
     * 懒汉式
     * @return
     */
    public synchronized static Singler1 getInstance(){
        if(instance == null){
            instance = new Singler1();
        }
        return instance;
    }
}
