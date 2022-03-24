package com.bjpowernode.pa03;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    /*环绕通知方法的定义格式：
    *   1.访问权限修饰符为public
    *   2.必须有返回值，推荐使用Object
    *   3.方法名称自定义
    *   4.方法的形式参数为固定的：ProceedingJoinPoint
    * */

    /*@Around 环绕通知
    *   属性：value 切入点表达式
    *   使用位置：方法定义的上面
    * 特点：
    *   1）@Around是功能最强的通知
    *   2）在目标方法的前和后都能增强功能
    *   3）控制目标方法是否被调用执行
    *   4）修改原来的目标方法的执行结果，会影响最后的调用结果
    *
    *   环绕通知，等同于jdk动态代理的，InvocationHandler接口
    *   参数：ProceedingJoinPoint 就等同于Method
    *           作用：用于执行目标方法
    *   方法的返回值就是目标方法的执行结果，可以被修改
    *
    *   环绕通知：在项目中主要用作事务处理，在目标方法之前执行事务，执行目标方法，在目标方法之后提交事务
    * */
    @Around(value="execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp){

        //控制目标方法是否被调用执行举例：
        //  根据目标方法的第一个参数是否为zhangjiatao来决定是否调用目标方法
        Object[] args = pjp.getArgs();
        String arg = "";
        if(args!=null && args.length>=1){
            Object temp = args[0];
            arg = (String)temp;
        }
        Object result = null;
        System.out.println("环绕通知：在目标方法之前，输出时间："+new Date());

        //执行目标方法
        try {
            if("zhangjiatao".equals(arg)){    //根据目标方法的第一个参数来决定是否调用目标方法
                result = pjp.proceed();
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("环绕通知：在目标方法之前，提交事务");//相当于method.invoke();Object result = doFirst();

        //修改原来的目标方法的执行结果
        if(result != null){
            result = "zhnangjiatao juwudi";
        }
        //返回目标方法的执行结果
        return result;
    }
}
