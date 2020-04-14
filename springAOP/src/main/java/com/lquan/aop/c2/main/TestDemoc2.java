package com.lquan.aop.c2.main;/**
 * Created by 01370602 on 2020/4/14.
 */

import com.lquan.aop.c2.config.AppConfigC2;
import com.lquan.aop.c2.dao.IndexDaoc2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName TestDemoc2
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class TestDemoc2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfigC2.class);

       IndexDaoc2 indexDaoc2 = (IndexDaoc2) annotationConfigApplicationContext.getBean("orderDao");
        System.out.println(indexDaoc2);

       indexDaoc2.query();
    }
}
