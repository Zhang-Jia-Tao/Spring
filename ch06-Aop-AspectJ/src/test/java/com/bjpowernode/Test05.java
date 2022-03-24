package com.bjpowernode;

import com.bjpowernode.pa05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {



    //使用cglib创建代理
    @Test
    public void Test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService service = (SomeService) ac.getBean("SomeService");
        service.doSome();
    }

}
