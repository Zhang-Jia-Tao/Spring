package org.example.service;

import org.example.dao.SomeService;
import org.example.domain.Student;

import java.util.List;

public class ServiceImpl implements Service {
    private SomeService sc = null;
    @Override
    public void dosome() {
        List<Student> students = sc.select_students();
        for(Student stu:students){
            System.out.println(stu.getName());
        }
    }
}
