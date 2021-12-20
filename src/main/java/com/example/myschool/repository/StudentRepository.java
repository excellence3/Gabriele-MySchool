package com.example.myschool.repository;

import com.example.myschool.model.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
}
