package com.bjpowernode.pa01;

//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome(String name, Integer age) {
        //
        System.out.println("目标接口的实现类的实现方法：dosome()");
    }
}
