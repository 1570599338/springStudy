package com.lquan.aop.c2.aop;/**
 * Created by 01370602 on 2020/4/14.
 */

import com.lquan.aop.c2.dao.IndexDaoc2;
import com.lquan.aop.c2.dao.impl.IndexDaoc2Impl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ClassName AspectC2
 *
 * @Author lquan
 * @Description //TODO
 *
 * 直接实现不需要在声明pointCut
 *
 * @Date
 * @Param
 * @return
 **/
//@Component
//@Aspect
public class AspectC2Direct {


    /**
     * 通知织入连接点
     */
    @Before("execution(* com.lquan.aop.c2.dao.*.*(..))")
    public void say(){
        System.out.println("通知@Before(\"execution(* com.lquan.aop.c2.dao.*.*(..))\")");
    }




    @Around("execution(* com.lquan.aop.c2.dao.*.*(..))")
    public void sayAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getThis()+"---"+this.hashCode());

        System.out.println("通知@Before(\"execution(* com.lquan.aop.c2.dao.*.*(..))\")");

        joinPoint.proceed();
    }
}
