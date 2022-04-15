package com.example.feignconsumer.controller;

import com.example.ValidateClient;
import com.example.feign.vo.ClassVo;
import org.apache.commons.text.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description: XxxController
 * @author: leiming5
 * @date: 2022/2/22 20:21
 */
@RestController
public class XxxController {
    private static final Logger LOGGER = LoggerFactory.getLogger(XxxController.class);
    @Resource
    private ValidateClient validateClient;

    @GetMapping("/consumer/get")
    public String printStr(@RequestParam("label") String label, @RequestHeader("value") String value) {
        System.out.println("consumer : get only");
        String param =  validateClient.printStr(label,value);

        LOGGER.info("before param is  {}",param);
        if(param.contains("\"")) {
            param = StringEscapeUtils.unescapeJava(param);
            param= param.replaceFirst("\"", "");
            param= param.substring(0,param.length()-1);
        }
        LOGGER.info("after param is  {}",param);
        return param;
    }

    @PostMapping("/consumer/post")
    public ClassVo testPost(@RequestBody ClassVo result) {
        System.out.println("consumer : post only");
        return validateClient.testPost(result);
    }

    @GetMapping("test")
    public String xxx() {
        System.out.println("hello world!");
        return "Hello World!";
    }
}
