package com.example.myschool.controller;

import com.example.myschool.repository.StudentRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentsController {

    private StudentRepository studentRepository;

    public StudentsController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public String getClasses(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "students";
    }

}
