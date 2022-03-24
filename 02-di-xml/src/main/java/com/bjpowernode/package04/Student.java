package com.bjpowernode.package04;

import com.bjpowernode.package04.School;

public class Student {
    private String name;
    private int age;
    private School myschool;

    public Student(){
        System.out.println("Student的午餐构造方法");
    }


    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println(age);
        this.age = age;
    }

    public void setSchool(School school){
        this.myschool = school;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + myschool +
                '}';
    }
}
