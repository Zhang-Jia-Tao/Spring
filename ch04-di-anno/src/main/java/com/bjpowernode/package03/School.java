package com.bjpowernode.package03;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="school")
public class School {

    @Value("山东科技大学")
    private String name;
    @Value("青岛")
    private String address;


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

    public String Print(){
        String re = null;
        System.out.println("this is a function/method to solve Print's question");
        re="................";
        return re;
    }
}
