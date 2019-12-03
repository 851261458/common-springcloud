package com.mju.band3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-12-02 11:23
 **/
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
