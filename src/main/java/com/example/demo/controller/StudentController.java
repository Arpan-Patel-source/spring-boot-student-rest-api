package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RequestMapping("/api/student")
@RestController
public class StudentController {
StudentService studentService;

public StudentController(StudentService studentService) {
	this.studentService = studentService;
}
@PostMapping
public ResponseEntity<Student> save(@RequestBody Student student)
{
	Student stu = studentService.save(student);
	return new ResponseEntity<>(stu,HttpStatus.CREATED);
}

@GetMapping("/{id}")
public ResponseEntity<Student> findById(@PathVariable("id") int id)
{
	Student stu = studentService.findById(id);
	if(stu==null) return ResponseEntity.notFound().build();
	return ResponseEntity.ok(stu);
}

@PutMapping
public ResponseEntity<Student> update(@RequestBody Student student)
{
	Student stu = studentService.update(student);
	return ResponseEntity.ok(stu);
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> delte(@PathVariable("id") int id)
{
	int rowAffected=studentService.delete(id);
	if(rowAffected==0)return ResponseEntity.notFound().build();
	return ResponseEntity.noContent().build();
}

@GetMapping
public ResponseEntity<List<Student>> findAll()
{
	List<Student> list = studentService.findAll();
	return ResponseEntity.ok(list);
}
}
