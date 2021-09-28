package com.zwf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Discription: Eureka服务启动类
 * @Author: 张文峰
 * @Date: 2021-09-25 20:34:21
 */
@SpringBootApplication
// 声明启用Eureka服务
@EnableEurekaServer
public class EurekaColonyOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaColonyOneApplication.class, args);
    }
}
