package com.mju.band3.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-11-29 22:08
 **/
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced// Ribbon默认轮询负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myIRule(){
//        return new RandomRule();//选择随机负载均衡，取消默认的轮询负载均衡,原厂附带7个算法负载均衡
        return new RetryRule();//轮询负载，有服务DOWN掉后在重试几次后会排除它
    }
}
