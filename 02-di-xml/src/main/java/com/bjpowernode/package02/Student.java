package com.bjpowernode.package02;

public class Student {
    private String name;
    private int age;
    private School school;

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

    public School getSchool(){
        return school;
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
