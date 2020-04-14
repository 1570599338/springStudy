package com.lquan.aop.c2.aop;/**
 * Created by 01370602 on 2020/4/14.
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ClassName AspectC2
 *
 * @Author lquan
 * @Description //TODO
 *
 * aop默认的情况是单例，多例情况
 *
 * @Date
 * @Param
 * @return
 **/
@Component
@Aspect("perthis(this(com.lquan.aop.c2.dao.IndexDaoc2))")
@Scope("prototype")
public class AspectCProtype {


    /**
     * 通知织入连接点
     */
//    @Before("execution(* com.lquan.aop.c2.dao.*.*(..))")
//    public void say(){
//        System.out.println("多例通知@Before(\"execution(* com.lquan.aop.c2.dao.*.*(..))\")");
//    }




    @Around("execution(* com.lquan.aop.c2.dao.*.*(..))")
    public void sayAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("********************************************");
        System.out.println(joinPoint.getThis()+"---"+this.hashCode()+""+joinPoint.getThis().hashCode());

        joinPoint.proceed();
        System.out.println("多例通知@Before(\"execution(* com.lquan.aop.c2.dao.*.*(..))\")");
    }
}
