package com.zwf.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Discription: Ribbon负载均衡配置
 * @Author: 张文峰
 * @Date: 2021-09-29 15:18:39
 */
@Configuration
public class LoadBalancing {
    /**
     * 负载均衡策略配置
     *
     * @param
     * @return : com.netflix.loadbalancer.IRule
     * @Date 2021/9/29 - 15:19
     */
    @Bean
    public IRule rule() {
        // RandomRule                   ------ 随机
        // RoundRobinRule               ------ 轮询
        // BestAvailableRule            ------ 最小并发
        // AvailabilityFilteringRule    ------ 过滤
        // WeightedResponseTimeRule     ------ 响应时间
        // RetryRule                    ------ 轮询重试
        // ZoneAvoidanceRule            ------ 性能可用性

        return new RandomRule();
    }
}
