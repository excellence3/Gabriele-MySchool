package com.example.myschool.controller;

import com.example.myschool.repository.SchoolClassRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolClassController {
    
    private SchoolClassRepository schoolClassRepository;

    public SchoolClassController(SchoolClassRepository schoolClassRepository) {
        this.schoolClassRepository = schoolClassRepository;
    }

    @GetMapping("/classes")
    public String getClasses(Model model) {
        model.addAttribute("schoolClasses", schoolClassRepository.findAll() );
        return "classes";
    }
}
