package com.demo;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {

        String format = String.format("%03d", Integer.valueOf("003") + 1);
        System.out.println(format);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -5);
        System.out.println(calendar.getTime());

        int i = calendar.getTime().compareTo(new Date());

        System.out.println(i + "");

        Map<String, String> map  = new HashMap<>();
        map.put("4","aaa");
        map.put("2","bbb");
        map.put("3","ccc");
        System.out.println(map);

        System.out.println(map.keySet());
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        System.out.println(list);
    }
}
