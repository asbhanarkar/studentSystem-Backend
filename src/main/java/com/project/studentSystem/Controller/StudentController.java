package com.project.studentSystem.Controller;

import com.project.studentSystem.model.Student;
import com.project.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added successfully";
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/removeStudent")
    public String removeStudnt(@RequestBody Integer id){
        studentService.removeStudent(id);
        return "Removed student";
    }
}

