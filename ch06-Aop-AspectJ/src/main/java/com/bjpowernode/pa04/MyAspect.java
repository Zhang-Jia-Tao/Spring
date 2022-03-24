package com.bjpowernode.pa04;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    /*异常通知方法的定义格式
    *   1.访问权限修饰符为public
    *   2.返回值类型为void
    *   3.方法名称自定义
    *   4.方法的形参为Exception
    * */

    /*@AfterThrowing：异常通知
    *   属性：1）value 切入点表达式
    *        2）throwing 自定义的变量 ，表示目标方法抛出的对象
    *               变量名必须和异常通知方法的参数名一样
    *   特点：
    *       1）在目标方法抛出异常时执行
    *       2）可以作异常的监控程序，监控目标方法执行时是不是会有异常抛出
    *          如果有异常，可以通过发送信息告知程序员
    * */
    @AfterThrowing(value="execution(* *..SomeServiceImpl.doSecond(..))",throwing="ex")
    public void doSecond(Exception ex){
        System.out.println("抛出异常的信息为："+ex.getMessage());
    }
}
