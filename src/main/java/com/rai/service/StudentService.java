package com.rai.service;

import java.util.List;

import com.rai.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStuent(Student student);
	void deleteStudentById(Long id);
	
}
