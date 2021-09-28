package com.zwf.controller;

import com.zwf.pojo.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Discription: 示例：服务调用方
 * @Author: 张文峰
 * @Date: 2021-09-25 15:25:33
 */
@RestController
@RequestMapping("/consul")
public class ConsulConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    private static String url = "";

    @GetMapping("/getConsul/{param}")
    public TestEntity getData(@PathVariable("param") String param) {
        List<ServiceInstance> instances = discoveryClient.getInstances("consulProvider");
        // 判断是否获取到了数据
        if (instances == null && instances.size() == 0) {
            return null;
        }

        instances.forEach(ins -> {
            // 获取IP
            String host = ins.getHost();
            // 获取端口
            int port = ins.getPort();

            url = "http://" + host + ":" + port + "/provider/getData/" + param;
            System.out.println("URL :" + url);
        });
        if (url == null || "".equals(url)) {
            return null;
        }
        return restTemplate.getForObject(url, TestEntity.class);
    }
}
