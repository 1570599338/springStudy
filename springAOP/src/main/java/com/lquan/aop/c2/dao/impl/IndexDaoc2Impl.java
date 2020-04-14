package com.lquan.aop.c2.dao.impl;/**
 * Created by 01370602 on 2020/4/14.
 */

import com.lquan.aop.c2.dao.IndexDaoc2;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * ClassName IndexDaoc2Impl
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Repository
public class IndexDaoc2Impl implements IndexDaoc2{



    @Override
    public void query() {
        System.out.println("IndexDaoc2--Dao2");
    }


    @Override
    public void querySay(String str) {

        System.out.println("IndexDaoc2--querySay"+"-------"+str);

    }
}
