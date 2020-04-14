package com.lquan.aop.c2.config;/**
 * Created by 01370602 on 2020/4/14.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName AppConfigC2
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Configuration
@ComponentScan("com.lquan.aop.c2")
@EnableAspectJAutoProxy(proxyTargetClass =true )
public class AppConfigC2 {
}