package com.mju.band3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CommonConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonConsumerHystrixDashboardApplication.class, args);
    }

}
