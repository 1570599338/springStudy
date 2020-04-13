package com.lquan.defind.main;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.defind.model.User;
import com.lquan.defind.until.CommUtil;

import java.awt.*;

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

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        User user = new User();
        user.setAge(11);
        user.setName("lquan");

        CommUtil.getAnntation(user);

    }
}
