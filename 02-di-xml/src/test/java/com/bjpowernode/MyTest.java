package com.bjpowernode;


import com.bjpowernode.package01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {



    @Test
    public void Test01(){
        String config = "package01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)ac.getBean("student");
        System.out.println(stu);

        System.out.println("=================");

        Student student = (Student)ac.getBean("student02");
        System.out.println(student);
    }

    @Test
    public void Test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("package01/applicationContext.xml");
        Student student =(Student)ac.getBean("Student03");

        System.out.println("==============");
        System.out.println(student.toString());

    }



}