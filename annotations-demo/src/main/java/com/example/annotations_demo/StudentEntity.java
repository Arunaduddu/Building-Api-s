package com.example.annotations_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Entity
//i wrote table name as student in DB but here if i write 2 Entity it will create auto table with the name of classname that is the reason i wrote this @table
@Table(name = "student")
@Data
public class StudentEntity {
    @Id


    private String id;
    private String name;
    private String phoneNumber;
    private String emailId;
    private String course;
}


