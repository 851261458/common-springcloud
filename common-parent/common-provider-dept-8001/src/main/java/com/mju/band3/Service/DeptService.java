package com.mju.band3.Service;

import com.mju.band3.entity.Dept;


import java.util.List;


public interface DeptService {

    /**
     * 插入
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    Dept findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<Dept> findAll();

}
