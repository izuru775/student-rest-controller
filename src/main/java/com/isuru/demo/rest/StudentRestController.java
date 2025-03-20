package com.isuru.demo.rest;

import com.isuru.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;
    // Define @PostConstruct to load the student data ... only once
    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();

        students.add(new Student("Isuru","Adikaram"));
        students.add(new Student("Pamodee","Panchalee"));
        students.add(new Student("Nipuna","Adikaram"));
    }

   // Define an endpoint for "/student" -return a list of students
   @GetMapping("/students")
   public List<Student> getStudents(){

       return students;
   }

   @GetMapping("/students/{studentId}")
   public Student getStudent(@PathVariable int studentId){

       return students.get(studentId);
   }
}
