package com.example.demo.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
StudentDao studentDao;

	public StudentServiceImpl(StudentDao studentDao) {
	this.studentDao = studentDao;
}

	@Override
	public Student save(Student student) {
		
		return studentDao.save(student);
	}

	@Override
	public Student findById(int id) {

		return studentDao.findById(id);
	}

	@Override
	public Student update(Student student) {
		
		return studentDao.update(student);
	}

	@Override
	public int delete(int id) {
		
		return studentDao.delete(id);
	}

	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}

}
