package com.bjpowernode;

import com.bjpowernode.package04.Student;
import com.bjpowernode.package04.primaryschool;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {

    @Test
    public void Test01(){
        String config = "package04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)ac.getBean("student");
        System.out.println(stu);
    }

}
