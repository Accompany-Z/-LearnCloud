package com.zwf.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.zwf.pojo.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Discription: 示例：服务调用方
 * @Author: 张文峰
 * @Date: 2021-09-25 15:25:33
 */
@RestController
@RequestMapping("/restTemplate")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getRestTemplate/{param}")
    public TestEntity getData(@PathVariable("param") String param) {
        System.out.println("Consumer 接收到参数：" + param);

        String url = "http://localhost:8000/provider/getData/" + param;

        return restTemplate.getForObject(url, TestEntity.class);
    }
}
