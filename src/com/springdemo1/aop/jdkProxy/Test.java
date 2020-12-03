package com.springdemo1.aop.jdkProxy;




import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理演示类
 */
public class Test {
    public static void main(String[] args) {
        //被代理对象
        Star liudehua=new Liudehua();

        InvocationHandler handler=new StarProxy(liudehua);
        ClassLoader loader=liudehua.getClass().getClassLoader();
        Class[] interfaces=liudehua.getClass().getInterfaces();
        //生成动态代理对象
        Star star=(Star)Proxy.newProxyInstance(loader,interfaces,handler);
        System.out.println("动态代理对象类型"+star.getClass().getName());
        String result=star.sing("刘德华");
        System.out.println(result);
    }
}
