package com.bjpowernode.package05;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component("stu01")
public class Student {
    @Value("zjt")
    private String name;
    @Value("110")
    private int age;

    /*@Resource:来自JDK的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用类型赋值
    *           使用的也是自动注入的原理，支持byName、byType。默认是byName
    * 使用位置：
    *           1）在属性定义上面
    *           2）在set方法上面
    *   默认是byName：先使用byName自动注入，如果byName赋值失败，@Resource会自动使用byType进行自动注入
    *
    *   如果只想使用byName的方式，需要增加一个属性：name   name的值是bean的id）
    * */
    private School school;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
