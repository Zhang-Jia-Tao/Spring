package com.bjpowernode.package01;

import org.springframework.stereotype.Component;
/*
 *@Component:用于创建对象，等同于<bean>的功能
 *  属性：value：该类型对象的名称或者说是标志，是唯一值，相当于bean中id的功能
 *  创建的对象在spring容器中就一个
 *  @Component(value="student")  == <bean id="student" class="com.bjpowernode.package01.Student"
 *
 *
 * spring中和@Component功能一致，用于创建对象的注解还有：
 * 1.@Repository(用于持久层)  用于dao的实现类：表示创建dao对象，dao对象能够访问数据库
 * 2.@Service(用于业务层)  用于Service实现类：表示创建service对象，service对象是用于业务处理，可以有事务等的功能
 * 3.@Controller(用于控制器)  用于控制器类： 用于创建控制器对象的， 控制器对象能够接收用户提交的参数，显示请求的处理结果
 * 以上三个注解的使用方法和@Component是一样的，都能够创建对象，但是这三个还有额外的功能
 * @Repository、@Service、@Controller是给项目的对象分层的
 *
 * spring通过注解创建对象，会调用类的无参数构造方法
 *
 * */

@Component(value = "student")
public class  Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
