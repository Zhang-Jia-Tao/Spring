package com.bjpowernode.Exception;


//自定义的运行时异常
public class NotEnough extends RuntimeException{
    public NotEnough() {
        super();
    }

    public NotEnough(String message) {
        super(message);
    }
}
