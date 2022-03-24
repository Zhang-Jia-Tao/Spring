package com.bjpowernode;

import com.bjpowernode.service.Trade;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Trade trade = (Trade) ac.getBean("Trade");
        trade.Buy(1001,10);
    }
}
