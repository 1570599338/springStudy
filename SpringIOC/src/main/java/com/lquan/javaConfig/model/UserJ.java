package com.lquan.javaConfig.model;/**
 * Created by 01370602 on 2020/4/13.
 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ClassName UserJ
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class UserJ {

    private  String name;
    private  Integer age;

    public String getName() {
        System.out.println("----------getName");
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @PostConstruct
    public void getPostConstruction(){
        System.out.println("@PostConstruct****getPostConstruction()");
    }


    @PreDestroy
    public void getClear(){
        System.out.println("@PreDestroy****getClear");
    }

}
