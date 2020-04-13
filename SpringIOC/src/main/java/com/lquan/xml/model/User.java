package com.lquan.xml.model;/**
 * Created by 01370602 on 2020/4/13.
 */

/**
 * ClassName User
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class User {
    private  String name;
    private  Integer age;

    public String getName() {
        System.out.print("----------getName");
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
}
