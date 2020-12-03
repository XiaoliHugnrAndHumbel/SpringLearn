package com.xiaoli;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AnnotaionAspect {

    public void saveAccount(){
        System.out.println("执行了保存");
//        int i =1/0;
    }
    public void updateAccount(int i){
        System.out.println("执行了更新");
    }
    public int deleteAccount(){
        System.out.println("执行了删除");
        return 0;
    }
}
