package com.lquan.aop.c2.aop;/**
 * Created by 01370602 on 2020/4/14.
 */

import com.lquan.aop.c2.dao.IndexDaoc2;
import com.lquan.aop.c2.dao.impl.IndexDaoc2Impl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName AspectC2
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
//@Component
//@Aspect
public class AspectC2 {


    /**
     * introduction 引入
     */
    //@DeclareParents(value = "com.lquan.aop.c2.dao.*",defaultImpl = IndexDaoc2Impl.class)
    @DeclareParents(value = "com.lquan.aop.c2.dao.OrderDao",defaultImpl = IndexDaoc2Impl.class)
    public static IndexDaoc2 indexDaoc2;





}
