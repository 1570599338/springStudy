package com.lquan.aop.c2.main;/**
 * Created by 01370602 on 2020/4/14.
 */

import com.lquan.aop.c2.config.AppConfigC2;
import com.lquan.aop.c2.dao.IndexDaoc2;
import com.lquan.aop.c2.dao.impl.IndexDaoc2Impl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName TestDemoc2
 *
 * @Author lquan
 * @Description //TODO
 *
 * 直接将 @Before("execution(* com.lquan.aop.c2.dao.*.*(..))")
 * @Date
 * @Param
 * @return
 **/
public class TestDemoc2Direct {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfigC2.class);

        IndexDaoc2 indexDaoc2 =  annotationConfigApplicationContext.getBean(IndexDaoc2Impl.class);
        System.out.println(indexDaoc2);


        IndexDaoc2 indexDaoc =  annotationConfigApplicationContext.getBean(IndexDaoc2Impl.class);
        indexDaoc2.query();
       indexDaoc.querySay("Hello");
    }
}
