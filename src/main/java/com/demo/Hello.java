package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李祥华
 * @description
 * @time 2018/11/20 11:14
 */
@RestController
public class Hello {

    @RequestMapping("/")
    public String home(){
        String str = "Hello World";
        return str;
    }
}
