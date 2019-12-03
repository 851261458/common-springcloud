package com.mju.band3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CommonEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(CommonEureka7003Application.class, args);
    }

}
