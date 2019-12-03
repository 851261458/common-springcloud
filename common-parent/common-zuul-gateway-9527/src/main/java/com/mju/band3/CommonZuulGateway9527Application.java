package com.mju.band3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CommonZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(CommonZuulGateway9527Application.class, args);
    }

}
