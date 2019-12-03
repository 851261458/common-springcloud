package com.mju.band3.Controller;


import com.mju.band3.entity.Dept;
import com.mju.band3.service.DeptClientSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-11-29 22:11
 **/
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientSerivce deptClientSerivce;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add( Dept dept){
        //三个参数：url,requestMap ResponseBean.class
        return  deptClientSerivce.add(dept);
    }
    @RequestMapping("/consumer/dept/findById/{deptNo}")
    public Dept findById(@PathVariable(name = "deptNo") Long deptNo){
        //三个参数：url,requestMap ResponseBean.class
        return deptClientSerivce.findById(deptNo);
    }
    @RequestMapping("/consumer/dept/findAll")
    public List findAll(){
        //三个参数：url,requestMap ResponseBean.class
        return  deptClientSerivce.findAll();
    }



}
