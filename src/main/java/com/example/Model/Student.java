package com.example.Model;

import java.time.LocalDate;
import java.time.Month;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name ="student")
public class Student{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate dob;
    private int age;
    private int date;
    private int day;
    private int month;
    private int year;
    
	public Student(){
		
	}
	
	public Student(Long id, String name, LocalDate dob, int age, int date, int day, int month, int year){
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.date = date;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYearOfBirth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Month getMonthOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getDayOfBirth() {
		// TODO Auto-generated method stub
		return 0;
	}
}



