package com.wine;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 11:25
 */
public class JGJ extends Wine {
    public JGJ(){
        setName("JGJ");
    }

    /**
     * 重写父类方法，实现多态
     */
    @Override
    public String drink(){
        return "喝的是 " + getName();
    }

    /**
     * 重写toString()
     */
    @Override
    public String toString(){
        return "Wine : " + getName();
    }
}
