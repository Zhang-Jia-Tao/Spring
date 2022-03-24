package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentService {

    public int addStudent(Student student);
    public List<Student> queryStudent();
}
