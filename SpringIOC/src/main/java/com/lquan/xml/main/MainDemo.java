package com.lquan.xml.main;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.xml.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName MainDemo
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class MainDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =new ClassPathXmlApplicationContext("springXML.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        user.getName();
    }
}
