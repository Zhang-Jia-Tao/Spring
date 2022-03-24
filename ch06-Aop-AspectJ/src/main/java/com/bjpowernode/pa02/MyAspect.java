package com.bjpowernode.pa02;



import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;



@Aspect
public class MyAspect {
    /*后置通知
    *  定义方法：方法是实现切面功能的
    *   方法定义的要求是：
    *       1）方法的访问权限修饰符为public
    *       2）方法的返回值为void
    *       3）方法的名称自定义
    *       4）方法有参数，推荐是Object，参数名自己定义
    *
    * */

    /*后置通知：@AfterReturning
    *       属性：1）value 切入点表达式
    *            2）returning 自定义的变量，表示目标方法的返回值
    *       使用位置：在方法定义的上面
    *   特点：
    *       1）由后置通知@AfterReturning注解的方法，在目标方法之后执行
    *       2）能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
    *       3）可以修改这个返回值
    * */

    @AfterReturning(value="execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
     public void myAfterReturning(Object res){
        //形参：Object res 是目标方法执行后的返回值，根据返回值做你的切面的功能处理
        System.out.println("目标方法的返回值是："+res);
     }
}


