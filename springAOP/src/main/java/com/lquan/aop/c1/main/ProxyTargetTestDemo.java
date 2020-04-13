package com.lquan.aop.c1.main;/**
 * Created by 01370602 on 2020/4/14.
 */

import com.lquan.aop.c1.config.AppConfig;
import com.lquan.aop.c1.dao.IProxyTargetDao;
import com.lquan.aop.c1.dao.IndexDao;
import com.lquan.aop.c1.dao.impl.ProxyTargetImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * ClassName ProxyTargetTestDemo
 *
 * @Author lquan
 * @Description //TODO
 * 设置不同的动态代理然后查看代理对象实什么样子
 *
 * @Date
 * @Param
 * @return
 **/
public class ProxyTargetTestDemo {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        //利用jdk的动态代理来实现
       // ProxyTargetImpl indexDao = annotationConfigApplicationContext.getBean(ProxyTargetImpl.class);


        IProxyTargetDao indexDao = annotationConfigApplicationContext.getBean(IProxyTargetDao.class);
        indexDao.query();

        // annotation的
        System.out.println("***********annotation的***********");
        IndexDao indao = annotationConfigApplicationContext.getBean(IndexDao.class);
        indao.query();

        /**
        Class[] interfaces = new Class[]{IProxyTargetDao.class};
        // 获取代理类的二进制字节码
        byte[] bytes = ProxyGenerator.generateProxyClass("LQuan", interfaces);
        //生成文件
        File file = new File("./springAOP/src/main/resources/JdkD1.class");
        FileOutputStream fw=new FileOutputStream(file);
        fw.write(bytes);
        fw.flush();
        fw.close();
**/










    }
}
