package com.bjpowernode.package04;

public class primaryschool extends School{
    public primaryschool(){
        System.out.println("======");
    }

    @Override
    public void setName(String name) {
        super.setName("调用的是这个");
    }

    public void done(){
        System.out.println("***********");
    }
}
