package com.project.studentSystem.service;

import com.project.studentSystem.model.Student;
import com.project.studentSystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSetviceImplemetation implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {

        return studentRepo.findAll();
    }

    @Override
    public void removeStudent(Integer id) {
        studentRepo.deleteById(id);
    }
}
