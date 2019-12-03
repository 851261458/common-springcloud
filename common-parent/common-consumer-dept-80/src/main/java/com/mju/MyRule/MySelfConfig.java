package com.mju.MyRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-12-01 22:46
 **/
@Configuration
public class MySelfConfig {

    @Bean
    public IRule myIRule(){
        return new MySelfRule();
    }
}
