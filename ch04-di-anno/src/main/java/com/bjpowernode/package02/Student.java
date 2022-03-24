package com.bjpowernode.package02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("Stu")
public class Student {

    /*@Value:简单类型的属性赋值
    *   @Value 中有属性：value，用于表示要赋值的值
    *          @Value所在位置：
    *                   1 在属性定义的上面，无需set方法，推荐使用
    *                   2 在set方法上面
    * */

    @Value(value="张佳涛")
    private String name;
    @Value(value="20")
    private int age;
    @Value("男")
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    @Value("300")
    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
