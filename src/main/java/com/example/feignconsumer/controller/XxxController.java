package com.example.feignconsumer.controller;

import com.example.ValidateClient;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: XxxController
 * @author: leiming5
 * @date: 2022/2/22 20:21
 */
@RestController
public class XxxController {

    @Resource
    private ValidateClient validateClient;

    @GetMapping("feign/test")
    public String feignTest(String xxxx) {
        System.out.println("hello world!");
        StringUtils.isEmpty("");
        return validateClient.printStr();
//        return "12321312===>";
    }

    @GetMapping("test")
    public String xxx() {
        System.out.println("hello world!");
        return "Hello World!";
    }
}
