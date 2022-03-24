package com.bjpowernode;


import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {

    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String names[] = ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println("容器中对象的名称："+name+"|"+ac.getBean(name));
        }
    }

    @Test
    public void Test02(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentDao dao = (StudentDao)ac.getBean("studentDao");
        Student stu = new Student(1019,"zhangjiatao","2447014461@qq.com",12);
        int nums = dao.insertStudent(stu);
        System.out.println("nums-"+nums);
    }

    @Test
    public void Test03(){
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> studentList=service.queryStudent();
        for(Student stu:studentList){
            System.out.println(stu);
        }
    }
}
