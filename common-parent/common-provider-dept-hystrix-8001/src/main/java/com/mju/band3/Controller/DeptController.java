package com.mju.band3.Controller;


import com.mju.band3.Service.DeptService;
import com.mju.band3.entity.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-11-29 20:52
 **/
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    //一旦调用服务失败并抛出了错误信息后，会自动调用HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept findById(@PathVariable(name = "deptNo") Long deptNo) {
        Dept dept=deptService.findById(deptNo);
        if (null==dept){
            throw new RuntimeException("该ID:"+deptNo+"对应消息不存在---");
        }
        return dept;
    }




    public Dept processHystrix_Get(@PathVariable(name = "deptNo")Long deptNo){
        return new Dept().setDbSource("no this database in MYSQL").setDeptName("该ID:"+deptNo+"没有相对应的信息===")
                .setDeptNo(deptNo);
    }
}
