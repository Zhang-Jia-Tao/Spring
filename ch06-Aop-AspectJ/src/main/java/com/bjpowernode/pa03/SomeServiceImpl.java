package com.bjpowernode.pa03;

public class SomeServiceImpl implements SomeService{

    @Override
    public String doFirst(String name,Integer age){
        System.out.println("===doFirst()===");
        return "zhangjiatao";
    }
}
