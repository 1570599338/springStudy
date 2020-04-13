package com.lquan.aop.c1.config;/**
 * Created by 01370602 on 2020/4/13.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName AppConfig
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Configuration
@ComponentScan("com.lquan.aop.c1")
@EnableAspectJAutoProxy(proxyTargetClass = true)

public class AppConfig {
}
