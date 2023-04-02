package com.project.studentSystem.service;

import com.project.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();

    public void removeStudent(Integer id);
}
