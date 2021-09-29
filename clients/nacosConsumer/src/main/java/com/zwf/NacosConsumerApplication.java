package com.zwf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Discription: 启动类
 * @Author: 张文峰
 * @Date: 2021-09-25 15:23:39
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }
}
