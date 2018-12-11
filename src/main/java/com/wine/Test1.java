package com.wine;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/11 9:57
 */
public class Test1 {

    public static void main(String[] args) {
        //定义父类数组
        Wine[] wines = new Wine[2];
        //定义两个子类
        Wine jnc = new JNC();
        Wine jgj = new JGJ();

        //父类引用子类对象
        wines[0] = jnc;
        wines[1] = jgj;

        for(int i = 0 ; i < 2 ; i++){
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
        }
        System.out.println("-------------------------------");
    }
}
