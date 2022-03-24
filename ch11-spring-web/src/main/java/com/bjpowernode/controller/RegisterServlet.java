package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String age = req.getParameter("age");

        System.out.println("111");

        Student student = new Student(Integer.valueOf(id),name,email,Integer.valueOf(age));

        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        webApplicationContext ctx = null;

        StudentService service = (StudentService) ctx.getBean("studentService");
        int num = service.addStudent(student);
        req.setAttribute("key",num);
        req.getRequestDispatcher("/result.jsp").forward(req,resp);
    }
}
