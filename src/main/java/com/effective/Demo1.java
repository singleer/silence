package com.effective;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Demo1 {
    public static void main(String[] args) {
        int a = 2;
        if(a != 2 && a != 7){
            System.out.println("ok");
        } else {
            System.out.println("sad");
        }

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
    }

}
