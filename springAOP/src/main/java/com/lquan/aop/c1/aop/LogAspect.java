package com.lquan.aop.c1.aop;/**
 * Created by 01370602 on 2020/4/13.
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName LogAspect
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Component
@Aspect
public class LogAspect {

    //切点:所有join point的集合
    @Pointcut("execution(* com.lquan.aop.c1.dao.*.*(..))")
    public  void PointCutExec(){

    }


    // 通知 Advice   织入的位置
    @Before("PointCutExec()")
    public void say(){
        System.out.println("通知");
    }

}
