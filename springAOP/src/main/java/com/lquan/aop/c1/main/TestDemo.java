package com.lquan.aop.c1.main;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.aop.c1.config.AppConfig;
import com.lquan.aop.c1.dao.IProxyTargetDao;
import com.lquan.aop.c1.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName TestDemo
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class TestDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        //IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
        IProxyTargetDao indexDao = annotationConfigApplicationContext.getBean(IProxyTargetDao.class);
        indexDao.query();
    }
}
