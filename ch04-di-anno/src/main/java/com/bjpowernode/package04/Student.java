package com.bjpowernode.package04;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {

    //@Value("zjt")
    @Value("${name}")
    private String name;

    /*
    * 引用类型的赋值：
    *       如果要使用byName方式，需要做的是：
    *           1.在属性上面加入@Autowired
    *           2.在属性上面加入@Qualifier(value="bean的id")：表示使用指定名称的bean赋值
    * */

    @Qualifier("sch")
    @Autowired
    School school;



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}
