package com.lquan.defind.model;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.defind.annotation.MyAnnotaition;

/**
 * ClassName User
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
@MyAnnotaition(value = "MyUser")
public class User {

    @MyAnnotaition(value = "MyUserFile")
    private  String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @MyAnnotaition(value = "MyUserMethon")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
