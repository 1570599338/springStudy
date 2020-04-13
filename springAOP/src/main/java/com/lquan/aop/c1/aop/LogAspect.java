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



 //*******************this和target的区别*****************************

    //*******************this*****************************


    //切点:所有join point的集合
    @Pointcut("this(com.lquan.aop.c1.dao.IProxyTargetDao)")
    public  void PointCutExecthis(){

    }


    // 通知 Advice   织入的位置
    @Before("PointCutExecthis()")
    public void saythis(){
        System.out.println("通知this");
    }



    //*******************target*****************************
    //切点:所有join point的集合
    @Pointcut("target(com.lquan.aop.c1.dao.IProxyTargetDao)")
    public  void PointCutExectarget(){

    }


    // 通知 Advice   织入的位置
    @Before("PointCutExectarget()")
    public void saytarget(){
        System.out.println("通知target");
    }



    //*******************target*****************************
    // annotation注解
    //切点:所有join point的集合
    @Pointcut("@annotation(com.lquan.aop.c1.annotation.Liu)")
    public  void PointCutExecAnno(){

    }


    // 通知 Advice   织入的位置
    @Before("PointCutExecAnno()")
    public void sayAnno(){
        System.out.println("通知annotation");
    }


}
