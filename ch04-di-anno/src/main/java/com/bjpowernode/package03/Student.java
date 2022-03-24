package com.bjpowernode.package03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {

    @Value("张佳涛")
    private String name;
    @Value("20")
    private int age;


    /*引用类型的赋值：
    *   @Autowired:spring框架提供的注解，实现引用类型的赋值
    *   spring中通过注解给引用类型赋值，使用的是自动注入的原理，支持byType、byName
    *   @Autowired:默认使用的是byType自动注入
    *   使用位置：
    *           1）在属性定义上面 无须set方法
    *           2）在set方法上面
    *
    *   @Autowired,有属性required，是一个布尔类型，默认为true
    *       @Autowired(required=true)：表示如果引用类型赋值失败，程序报错，并中止执行
    *       @Autowired(required=false)：表示引用类型如果赋值失败，程序正常执行，引用类型是null
    * */
    @Autowired(required = true)
    public School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
