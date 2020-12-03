package com.springdemo1.aop.jdkProxy;


/**
 * 明星实现类，刘德华类
 */
public class Liudehua implements Star{
    @Override
    public String sing(String name) {
        System.out.println(name+"给我一杯忘情水");
        return "唱完";
    }

    @Override
    public String dance(String name) {
        System.out.println(name+"开心的跳舞");
        return "跳完";
    }
}
