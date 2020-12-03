package com.springdemo1.aop.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 调用处理器实现类
 * 每次生成一个动态代理类对象时，都需要指定一个实现了该接口的处理器对象
 */
public class StarProxy implements InvocationHandler {

    //目标类，也就是被代理对象
    private Object target;

    public   StarProxy(Object target){
            this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //这里可以做增强方法
        System.out.println("收门票");
        Object result= method.invoke(target,args);
        System.out.println("录像");
        return result;
    }
}
