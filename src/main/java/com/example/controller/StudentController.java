package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Student;
import com.example.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
       this.studentService = studentService;
    }
    
    @PostMapping("/")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }
    
    @PutMapping("/{studentId}/updateAge")
    public ResponseEntity<Student> updateStudentAge(@PathVariable Long studentId) {
        Student updatedStudent = studentService.updateStudentAge(studentId);
        if (updatedStudent != null){
          return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping
    public ResponseEntity<List<Student>>getStudentsBetweenAges(
            @RequestParam("minAge") int minAge,
            @RequestParam("maxAge") int maxAge
    ){
        List<Student> students = studentService.getStudentsBetweenAges(minAge, maxAge);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    
}

