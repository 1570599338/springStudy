package com.lquan.javaConfig.config;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.javaConfig.model.UserJ;
import com.lquan.xml.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName ConfigrationMain
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@Configuration
public class ConfigrationMain {

    @Bean(name = "userJavaConfig")
    public UserJ getUser(){
        System.out.println("************");
        UserJ user = new UserJ();
        user.getName();
        return user;
    }
}
