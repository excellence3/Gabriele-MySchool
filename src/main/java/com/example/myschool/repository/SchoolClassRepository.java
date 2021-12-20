package com.example.myschool.repository;

import com.example.myschool.model.SchoolClass;

import org.springframework.data.repository.CrudRepository;

public interface SchoolClassRepository extends CrudRepository<SchoolClass, Long> {
    
}
