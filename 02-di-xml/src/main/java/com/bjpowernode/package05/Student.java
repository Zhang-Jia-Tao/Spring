package com.bjpowernode.package05;

import com.bjpowernode.package05.School;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student(){};

    public Student(String name, int age, School school){   //有参数的构造方法
        this.age = age;
        this.name = name;
        this.school = school;
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
