package com.mju.band3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommonProviderDept8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CommonProviderDept8003Application.class, args);
    }

}
