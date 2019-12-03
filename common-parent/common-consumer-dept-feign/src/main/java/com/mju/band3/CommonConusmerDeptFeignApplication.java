package com.mju.band3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.mju.band3"})//basePackages扫描引入外部AR包的注解@FeignClient下的类，不然他默认扫描本项目的
public class CommonConusmerDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonConusmerDeptFeignApplication.class, args);
    }

}
