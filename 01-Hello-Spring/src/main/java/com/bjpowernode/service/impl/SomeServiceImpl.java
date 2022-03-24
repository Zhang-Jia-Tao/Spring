package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome() {
        System.out.println("执行了SomeService");

    }
}
