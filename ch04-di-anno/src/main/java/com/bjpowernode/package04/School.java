package com.bjpowernode.package04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sch")
public class School {
    @Value("sdust")
    private String name;
    @Value("QingDao")
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
}
