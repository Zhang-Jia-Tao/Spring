package com.bjpowernode;

import com.bjpowernode.domain.SysUser;
import com.bjpowernode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {
    public static void main(String[] args) {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService)ac.getBean("MyService");
        SysUser user = new SysUser();
        user.setAddress("QingDao");
        user.setName("zhangjiatao");
        service.addUser(user);
    }

}
