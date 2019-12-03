package com.mju.band3.service;

import com.mju.band3.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-12-02 14:43
 **/
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientSerivce {
    @RequestMapping(value = "/dept/add",method = RequestMethod.GET)
    public boolean add( Dept dept);

    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public Dept findById(@PathVariable(name = "deptNo")Long deptNo);

    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
    public List findAll();
}
