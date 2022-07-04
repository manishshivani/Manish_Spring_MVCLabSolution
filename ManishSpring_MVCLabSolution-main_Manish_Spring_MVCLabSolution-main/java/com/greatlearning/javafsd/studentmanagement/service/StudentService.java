package com.greatlearning.javafsd.studentmanagement.service;

import java.util.List;

import StudentManagement.entity.Student;

public interface StudentService {

	List<Student> listAll();
	
	Student findById(int theId);
	
	void save(Student theStudent);
	
	void deleteById(int theId);


}
