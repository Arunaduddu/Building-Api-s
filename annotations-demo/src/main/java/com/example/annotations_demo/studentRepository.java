package com.example.annotations_demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepository extends JpaRepository<StudentEntity, String> {

    List<StudentEntity> id(String id);
}
