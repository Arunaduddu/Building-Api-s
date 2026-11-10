package com.example.annotations_demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    //service layer will talk to repository later to build bussiness logics
    studentRepository studentRepository;
//generating StudentService constructor using studentRepository Arguments
    public StudentService(studentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    //to fetching all the student details
    public List<StudentEntity> getStudent()
    {
        return studentRepository.findAll();
    }
    public StudentEntity createStudent(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }
    public StudentEntity updateStudent(String id, StudentEntity studentEntity){
        Optional<StudentEntity> existingStudent=studentRepository.findById(id);
        if (existingStudent.isPresent())
        {
            return  studentRepository.save(studentEntity);
        }
        return new StudentEntity();

    }
    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }

}
