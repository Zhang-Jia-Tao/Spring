package com.bjpowernode.pa01;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/* @Aspect:是aspectj框架中的注解
*       作用：表示当前类为切面类
*       切面类：是用来给业务方法增加功能的实现类
*       使用位置：在类定义的上面
* */

@Aspect
public class MyAspect {
    /*定义方法：方法是实现切面功能的
    *   方法定义的要求是：
    *       1）方法的访问权限修饰符为public
    *       2）方法的返回值为void
    *       3）方法的名称自定义
    *       4）方法可以有参数，也可以没有参数
    *           如果有参数，参数不能是自定义的，仅有几个参数可以使用
    * */

    /*@Before：前置通知注解
    *   属性 value：是切入点表达式，表示切面功能的执行位置
    *   在方法上面添加注解
    *   特点：
    *       1）在目标方法之前先执行
    *       2）不会改变目标方法的执行结果
    *       3）不会影响目标方法的执行
    * */

    /*由通知注解修饰的方法为通知方法
    *   指定通知方法中的参数：JoinPoint
    *   JoinPoint：指的是要加入切面功能的业务方法
    *       作用是：可以在通知方法中获取方法执行时的信息，例如方法的名称，方法的实参
    *       如果你的切面功能中需要用到方法的信息，就加入JoinPoint
    *       这个JoinPoint的值是由框架赋予的，必须是第一个位置的参数
    * */

    @Before(value="execution(public void SomeServiceImpl.dosome(String,Integer))")   //如果这一行代码写错，下面的功能代码就不会在目标方法之前执行
    public void myBefore(JoinPoint jp){
            //获取方法的完整定义
            System.out.println("方法签名："+jp.getSignature());
            //获取方法名称
            System.out.println("方法名称："+jp.getSignature().getName());
            //获取方法实参
            Object[] args = jp.getArgs();
            for(Object arg:args){
                System.out.println("参数："+arg);
            }
            //就是切面要执行的功能代码
            System.out.println("前置通知，切面功能：在目标方法之前输出执行时间："+new Date());
        }

}
