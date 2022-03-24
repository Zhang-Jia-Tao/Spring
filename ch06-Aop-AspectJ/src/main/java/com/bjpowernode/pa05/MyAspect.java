package com.bjpowernode.pa05;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before(value="execution(* com.bjpowernode.pa05.SomeService.doSome(..))")
    public void myBefore(){
        System.out.println("前置通知");
    }
}
