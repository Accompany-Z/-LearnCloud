package com.zwf.controller;

import com.zwf.pojo.TestEntity;
import com.zwf.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Discription: 示例接口发布/暴露层
 * @Author: 张文峰
 * @Date: 2021-09-25 15:15:06
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService service;

    @GetMapping("/getData/{param}")
    public TestEntity getData(@PathVariable("param") String param) {

        System.out.println("Provider 接收参数：" + param);
        return service.getData();

    }
}
