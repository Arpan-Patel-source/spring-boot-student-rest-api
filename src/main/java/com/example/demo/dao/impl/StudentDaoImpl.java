package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
JdbcTemplate jdbcTemplate;
	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
	@Override
	public Student save(Student student) {
		String query = "insert into insmarks(urno,uname,uphy,uche,umath) values(?,?,?,?,?)";
		Object[] data = {student.getId(),student.getUname(),student.getUphy(),student.getUche(),student.getUmath()};
		int rowAffected = jdbcTemplate.update(query,data);
		if(rowAffected != 0)return student;
		else throw new RuntimeException("Data Insertion Failure");
	}

	@Override
	public Student findById(int id) {
		String query = "select * from insmarks where urno=?";
		List<Student> list = jdbcTemplate.query(query,(rs,i)->{
			Student stu = new Student();
			stu.setId(rs.getInt(1));
			stu.setUname(rs.getString(2));
			stu.setUphy(rs.getString(3));
			stu.setUche(rs.getString(4));
			stu.setUmath(rs.getString(5));
			return stu;
		},id);
		if(list.isEmpty())return null;
		return list.get(0);
	}

	@Override
	public Student update(Student student) {
		String query = "update insmarks set uname=?,uphy=?,uche=?,umath=? where urno=?";
		Object[] data = {student.getUname(),student.getUphy(),student.getUche(),student.getUmath(),student.getId()};
		int rowAffected = jdbcTemplate.update(query,data);
		if(rowAffected != 0)return student;
		else throw new RuntimeException("Data Updation Failure");
	}

	@Override
	public int delete(int id) {
		String query = "delete from insmarks where URNO =?";
		int rowAffected = jdbcTemplate.update(query,id);
		return rowAffected;
	}

	@Override
	public List<Student> findAll() {
		String query = "select * from insmarks";
		List<Student> list = jdbcTemplate.query(query, (rs,i)->
		{
			Student stu = new Student();
			stu.setId(rs.getInt(1));
			stu.setUname(rs.getString(2));
			stu.setUphy(rs.getString(3));
			stu.setUche(rs.getString(4));
			stu.setUmath(rs.getString(5));
			return stu;
		});
		return list;
	}

}
