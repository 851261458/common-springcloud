package com.mju.band3.service;

import com.mju.band3.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: common-parent
 * @description
 * @author: Lwd
 * @create: 2019-12-02 17:31
 **/

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientSerivce> {
    @Override
    public DeptClientSerivce create(Throwable throwable) {
        return new DeptClientSerivce() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Long deptNo) {
                return new Dept().setDbSource("no this database in MYSQL").setDeptName("该ID:"+deptNo+"没有相对应的信息===DeptClientServiceFallBackFactory,服务器已经关闭，请连接其他服务器")
                        .setDeptNo(deptNo);
            }

            @Override
            public List findAll() {
                return null;
            }
        };
    }
}
