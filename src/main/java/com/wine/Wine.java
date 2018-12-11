package com.wine;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 9:56
 */
public class Wine {

    /*public void fun1(){
        System.out.println("Wine 的Fun1.....");
        fun2();
    }

    public void fun2(){
        System.out.println("Wine 的Fun2...");
    }*/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wine(){
    }

    public String drink(){
        return "喝的是 " + getName();
    }

    /**
     * 重写toString()
     */
    @Override
    public String toString(){
        return null;
    }
}
