package com.mju.band3.Controller;


import com.mju.band3.Service.DeptService;
import com.mju.band3.entity.Dept;
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

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }
    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public Dept findById(@PathVariable(name = "deptNo") Long deptNo) {
        return deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
    public List<Dept> findAll() {
        return deptService.findAll();
    }

}
