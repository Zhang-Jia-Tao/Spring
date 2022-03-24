package com.bjpowernode;

import com.bjpowernode.pa03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

    @Test
    public void Test(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("SomeService");
        String res = service.doFirst("zhangjiatao",20);  //表面上是调用的doFirst()方法，实则调用的是myAround()方法
        System.out.println(res);
    }
}
