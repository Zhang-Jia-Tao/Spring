package com.bjpowernode.package04;

public class School {
    private String name;
    private String address;

    public School(){
        System.out.println("School的午餐构造方法");
    };//无参数构造方法

    public School(String name, String address){  //有参数构造方法
        this.address = address;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
