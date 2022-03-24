package com.bjpowernode;

import com.bjpowernode.package05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {

    @Test
    public void Test(){
        String config="package05/spring-total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)ac.getBean("student");
        System.out.println(stu);
    }
}
