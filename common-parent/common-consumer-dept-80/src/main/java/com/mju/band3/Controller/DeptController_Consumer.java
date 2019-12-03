package com.mju.band3.Controller;

import com.mju.band3.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-11-29 22:11
 **/
@RestController
public class DeptController_Consumer {

//    private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{deptNo}")
    public Dept findById(@PathVariable(name = "deptNo") Long deptNo) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findById/"+deptNo,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findAll",List.class);
    }
}
