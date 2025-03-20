package com.isuru.demo.rest;

import com.isuru.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
   // Define an endpoint for "/student" -return a list of students
   @GetMapping("/students")
   public List<Student> getStudents(){
       List<Student> students = new ArrayList<>();

       students.add(new Student("Isuru","Adikaram"));
       students.add(new Student("Pamodee","Panchalee"));
       students.add(new Student("Nipuna","Adikaram"));

       return students;
   }

   @GetMapping("/students/{studentId}")
   public Student getStudent(@PathVariable int studentId){
       List<Student> students = new ArrayList<>();

       students.add(new Student("Isuru","Adikaram"));
       students.add(new Student("Pamodee","Panchalee"));
       students.add(new Student("Nipuna","Adikaram"));

       return students.get(studentId);
   }
}
