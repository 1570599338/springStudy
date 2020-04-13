package com.lquan.defind.until;/**
 * Created by 01370602 on 2020/4/13.
 */

import com.lquan.defind.annotation.MyAnnotaition;

/**
 * ClassName CommUtil
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class CommUtil {


    public  static  void getAnntation(Object object) throws NoSuchFieldException, NoSuchMethodException {

        Class clazz =object.getClass();

        //steup 1、 判断是否加了注解
       boolean fage =  clazz.isAnnotationPresent(MyAnnotaition.class);
        System.out.println("是否为注解:"+clazz.isAnnotationPresent(MyAnnotaition.class));

        if(fage){
           // steup 2、获取对应的注解类
            MyAnnotaition ann= (MyAnnotaition) clazz.getAnnotation(MyAnnotaition.class);


            // steup 3、获取注解的值
            String va = ann.value();
            System.out.println(va);

        }
        System.out.println("*********************************************");
        //steup 1、 判断FILE是否加了注解
       boolean bolName=  clazz.getDeclaredField("name").isAnnotationPresent(MyAnnotaition.class);
        if(bolName){
            // Step2  获取对应的注解
            MyAnnotaition anFile=  clazz.getDeclaredField("name").getAnnotation(MyAnnotaition.class);

            // steup 3
            String nameva =anFile.value();
            System.out.println(nameva);
        }


        System.out.println("*********************************************");
        //steup 1、 判断FILE是否加了注解
        boolean bolMethon=  clazz.getDeclaredMethod("getAge").isAnnotationPresent(MyAnnotaition.class);
        if(bolMethon){
            // Step2  获取对应的注解
            MyAnnotaition anMethon=  clazz.getDeclaredMethod("getAge").getAnnotation(MyAnnotaition.class);

            // steup 3
            String methonva =anMethon.value();
            System.out.println(methonva);
        }

    }

}
