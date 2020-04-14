# AOP

##1、自定义注解

##2、实现一个Aop


##3、Spring 怎么设置动态代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
其中proxyTargetClass=false 默认的情况下设置的jdk的动态代理，proxyTargetClass = true设置的为CGLIB


## 4、分别利用JDK和CGLib实现的动态代理后的，代理对象的放编译代码实例子。
###  proxyTargetClass = false 默认的false，spring是利用的jdk的动态代理来实现。
###  proxyTargetClass = true spring是利用的CGlib来实现。

        Class[] interfaces = new Class[]{IProxyTargetDao.class};
        // 获取代理类的二进制字节码
        byte[] bytes = ProxyGenerator.generateProxyClass("LQuan", interfaces);
        //生成文件
        File file = new File("./springAOP/src/main/resources/JdkD.class");
        FileOutputStream fw=new FileOutputStream(file);
        fw.write(bytes);
        fw.flush();
        fw.close();

#### JDK 动态代理生成的class反编译的
public final class LQuan extends Proxy implements IProxyTargetDao

#### CGLib 动态代理生成的class反编译的

public final class LQuan extends Proxy implements IProxyTargetDao



### aop的切入点表达式
execution

within

this

target

@annotation



### JoinPoint是干嘛的
他是Aop的一个连接点，可以通过他获得连接点信息，譬如：她所在的类，她所在target，她所在的代理对象，参数、方法的签名、



### instrudction 引入


### springAop默认情况下是单利的



## 直接将 @Before("execution(* com.lquan.aop.c2.dao.*.*(..))") 

@Component
@Aspect
public class AspectC2Direct {

     * 通知织入连接点
     */
    @Before("execution(* com.lquan.aop.c2.dao.*.*(..))")
    public void say(){
        System.out.println("通知");
    }
}


### perthis来实现多例---未成功


