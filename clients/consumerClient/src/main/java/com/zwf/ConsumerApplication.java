package com.zwf;

import com.zwf.config.LoadBalancing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Discription: 启动类
 * @Author: 张文峰
 * @Date: 2021-09-25 15:23:39
 */
@EnableEurekaClient
// 激活DiscoveryClient
@EnableDiscoveryClient
@SpringBootApplication
// 配置Ribbon负载均衡策略
// name属性：服务提供方应用名称
// configuration属性：设置负载均衡的Bean
@RibbonClient(name = "PROVIDERCLIENT", configuration = LoadBalancing.class)
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
