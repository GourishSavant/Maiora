package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.Model.Student;

@Repository
	public interface StudentRepository extends JpaRepository<Student, Long> {
	    
	    List<Student> findByAgeBetween(int minAge, int maxAge);
	

}
