package com.example.myschool.bootstrap;

import com.example.myschool.model.SchoolClass;
import com.example.myschool.model.Student;
import com.example.myschool.repository.SchoolClassRepository;
import com.example.myschool.repository.StudentRepository;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    private SchoolClassRepository schoolclassRepository;
    @Autowired
    private StudentRepository studentsRepository;

    @Override
    public void run(String... args) throws Exception {
        
        SchoolClass class1 = new SchoolClass("1A");
        SchoolClass class2 = new SchoolClass("1B");
        SchoolClass class3 = new SchoolClass("1C");

        Student student1 = new Student("Bugs", "Bunnny", 10, class1);
        Student student2 = new Student("Daffy", "Duck", 10, class1);
        Student student3 = new Student("Porky", "Pig", 10, class2);
        Student student4 = new Student("Speedy", "Gonzales", 10, class2);
        Student student5 = new Student("Wili E.", "Coyote", 10, class3);
        Student student6 = new Student("Lola", "Bunnny", 10, class3);

        schoolclassRepository.save(class1);
        schoolclassRepository.save(class2);
        schoolclassRepository.save(class3);

        studentsRepository.save(student1);
        studentsRepository.save(student2);
        studentsRepository.save(student3);
        studentsRepository.save(student4);
        studentsRepository.save(student5);
        studentsRepository.save(student6);
    }
    
    
}
