package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	Student save(Student student);
	Student findById(int id);
	Student update(Student student);
	int delete(int id);
	List<Student> findAll();
}
