package com.bjpowernode;

import com.bjpowernode.package03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {

    @Test
    public void Test01(){
        String config = "package03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)ac.getBean("student");
        System.out.println(stu);
    }


    //只用index来匹配有参数构造方法的形参
    @Test
    public void Test02(){
        String config = "package03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu =(Student)ac.getBean("student01");
        System.out.println(stu);
    }
}
