package com.example.annotations_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public List<StudentEntity> getStudent() {
        return studentService.getStudent();
    }

    // POST API - Create a new student
    @PostMapping("/")
    public StudentEntity CreateStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.createStudent(studentEntity);
    }

    //UPDATE API - update existing student
    @PutMapping("/{id}")
    public StudentEntity updateStudent(@PathVariable String id, @RequestBody StudentEntity studentEntity) {

        return studentService.updateStudent(id, studentEntity);
    }

    //DELETE API-Delete existing student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return "student Deleted Successfully";


    }

}