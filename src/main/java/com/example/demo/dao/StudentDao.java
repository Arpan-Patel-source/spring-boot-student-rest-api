package com.example.demo.dao;
import java.util.List;
import com.example.demo.model.Student;

public interface StudentDao {
	Student save(Student student);
	Student findById(int id);
	Student update(Student student);
	int delete(int id);
	List<Student> findAll();
}
