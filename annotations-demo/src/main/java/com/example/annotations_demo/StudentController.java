package com.example.annotations_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@ResponseBody

//instead of using this two annotations(@Controller+@ResponseBody)  we can use @RestController
@RestController//handle the http requests
@RequestMapping("/student")
public class StudentController {
    //sevice layer will talk to controller layer
    StudentService studentService;

    //generate StudentController Constructor using StudentService Arguments
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //get all student details and sending response back to service
    @GetMapping("/")
    public List<StudentEntity> getStudentEntity()
    {
        return studentService.getStudentEntity();
    }
}
