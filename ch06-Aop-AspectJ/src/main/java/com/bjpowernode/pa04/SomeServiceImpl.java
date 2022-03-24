package com.bjpowernode.pa04;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSecond(String name) {
        System.out.println("==doSecnod==");
        System.out.println(10/0);
    }
}
