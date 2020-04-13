package com.lquan.javaConfig.main;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.javaConfig.config.ConfigrationMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName MainJDemo
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class MainJDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(ConfigrationMain.class);
        annotationConfigApplicationContext.getBean("userJavaConfig");
        annotationConfigApplicationContext.close();

    }

}
