package com.example.feignconsumer.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: XxxController
 * @author: leiming5
 * @date: 2022/2/22 20:21
 */
@RestController
public class XxxController {


    @GetMapping("feign/test")
    public String feignTest(String xxxx) {
        System.out.println("hello world!");
        StringUtils.isEmpty("");
//        return validateClient.printStr(xxxx);
        return "12321312===>";
    }

    @GetMapping("test")
    public String xxx() {
        System.out.println("hello world!");
        return "Hello World!";
    }
}
