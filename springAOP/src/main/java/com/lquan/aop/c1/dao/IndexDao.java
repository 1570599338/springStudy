package com.lquan.aop.c1.dao;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.aop.c1.annotation.Liu;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * ClassName IndexDao
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/

@Repository
public class IndexDao {


    @Liu
    public void query(){
        System.out.println("IndexDao,查询Dao");
    }

}
