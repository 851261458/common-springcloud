package com.mju.band3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//熔断器
public class CommonProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CommonProviderDeptHystrix8001Application.class, args);
    }

}
