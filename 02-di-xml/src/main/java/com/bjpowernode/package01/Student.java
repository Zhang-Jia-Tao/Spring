package com.bjpowernode.package01;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参数构造方法");
    }

    public void setName(String name) {
        System.out.println(name); //验证set注入，spring是否调用类的set方法
        this.name = name;
    }

    public void setAge(int age) {  //spring会调用set方法，但是里面的内容可以自己规定
        System.out.println(age); //验证set注入，spring是否调用类的set方法
        this.age = age;
    }

    public void setEmail(String Email){
        System.out.println(Email);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
