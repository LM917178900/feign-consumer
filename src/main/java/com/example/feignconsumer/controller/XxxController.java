package com.example.feignconsumer.controller;

import com.lenovo.npi.auth.center.service.impl.AcUserServiceImpl;
import com.lenovo.npi.portal.module.masterdata.controller.CommonController;
import com.lenovo.platform.common.service.BaseService;
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
    BaseService baseService;
    @Resource
    private ValidateClient validateClient;
    @Resource
    private CommonController commonController;
    @Resource
    private AcUserServiceImpl userService;

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
