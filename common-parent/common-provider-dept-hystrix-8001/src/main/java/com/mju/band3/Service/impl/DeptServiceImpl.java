package com.mju.band3.Service.impl;

import com.mju.band3.Dao.DeptMapper;
import com.mju.band3.Service.DeptService;
import com.mju.band3.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-11-29 20:46
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept findById(Long deptNo) {
        return deptMapper.findById(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
