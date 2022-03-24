package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void Test01() {
        SomeService service = new SomeServiceImpl();

        service.dosome();
    }

    //🌟🌟spring默认创建对象的时间：在创建spring容器时，会创建配置文件中的所有对象
    //🌟🌟spring创建对象：默认调用的是无参构造方法
    @Test
    public void Test02() {
        //使用spring容器创建对象
        //1.指定sprig配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，用到ApplicationContext接口
        //ApplicationContext表示spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件,传入的参数为配置文件的类路径全限定名称
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，要用到调用对象的方法
        //利用Application中的 getBean("配置文件中bean的id的值") 方法
        SomeService service = (SomeService) ac.getBean("someService01");

        service.dosome();
    }


    //🌟🌟获取容器中对象的信息
    @Test
    public void Test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量："+nums);
        System.out.println("===============================");
        //获取容器中每个定义的对象的名称
        String[] names = ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }

    }

    //获取一个非自定义类的对象
    @Test
    public void Test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date date = (Date)ac.getBean("MyDate");
        System.out.println(date);
    }

    @Test
    public void Test05(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        SomeService service = (SomeService)ac.getBean("someService01");
        service.dosome();
    }
}