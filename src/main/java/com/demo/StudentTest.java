package com.demo;

import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author 李祥华
 * @description
 * @time 2019/1/5 14:21
 */
public class StudentTest {

    public static void main(String[] args) throws Exception {
        String name=java.net.URLEncoder.encode("测试", "UTF-8");
        System.out.println(name);
        name=java.net.URLEncoder.encode(name,"UTF-8");
        System.out.println(name);
        name=java.net.URLDecoder.decode(name, "UTF-8");
        System.out.println(name);
        System.out.println(java.net.URLDecoder.decode(name, "UTF-8"));


    }
}
