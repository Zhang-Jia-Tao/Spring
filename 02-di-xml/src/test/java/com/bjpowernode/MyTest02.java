package com.bjpowernode;

import com.bjpowernode.package02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void Test01(){
        String config="package02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)ac.getBean("student");
        System.out.println(stu);
    }

    @Test
    public void Test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("package02/applicationContext.xml");
        Student student = (Student) ac.getBean("Student");
        student.toString();
        System.out.println("========");
        System.out.println(student.getSchool());
    }
}
