package com.example.annotations_demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    //service layer will talk to repository later to build bussiness logics
    studentRepository studentRepository;
//generating StudentService constructor using studentRepository Arguments
    public StudentService(studentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    //to fetching all the student details
    public List<StudentEntity> getStudentEntity(){
        return studentRepository.findAll();
    }

}
