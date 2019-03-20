package com.designpattern.singler;

/**
 * @author 李祥华
 * @description
 * @time 2019/1/4 14:46
 * 双重检查
 */
public class Singler3 {
    private volatile static Singler3 instance;

    private Singler3(){

    }

    /**
     * Double Check版本
     * @return
     */
    private synchronized static Singler3 getInstance(){
        if(instance == null){
            synchronized (instance){
                if(instance == null){
                    instance = new Singler3();
                }
            }
        }
        return instance;
    }
}
