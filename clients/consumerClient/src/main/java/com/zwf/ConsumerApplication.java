package com.zwf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Discription: 启动类
 * @Author: 张文峰
 * @Date: 2021-09-25 15:23:39
 */
@EnableEurekaClient
// 激活DiscoveryClient
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
