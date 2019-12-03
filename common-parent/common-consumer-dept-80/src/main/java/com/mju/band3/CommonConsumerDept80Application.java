package com.mju.band3;

import com.mju.MyRule.MySelfConfig;
import com.mju.MyRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfConfig.class)//用来自定义负载均衡算法，
// 注意：此注解的自定义配置类不能放在@ComponentScan（注解于@SpringBootApplication上）所扫描的当前包下以及子包，否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享
//也就达不到特殊化定制的目的了
public class CommonConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(CommonConsumerDept80Application.class, args);
    }

}
