package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Student;
import com.example.repo.StudentRepository;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    			
    public List<Student>getStudentsBetweenAges(int minAge, int maxAge) {
        return studentRepository.findByAgeBetween(minAge, maxAge);
    }
   
    public Student updateStudentAge(Long studentId){
        Student student = studentRepository.findById(studentId).orElse(null);
        if (student != null){
            LocalDate currentDate = LocalDate.now();
            LocalDate birthDate = LocalDate.of(student.getYearOfBirth(),student.getMonthOfBirth(),student.getDayOfBirth());
            Period age = Period.between(birthDate, currentDate);
            student.setAge(age.getYears());
            return studentRepository.save(student);
        }
        return null;
        
    }
}
