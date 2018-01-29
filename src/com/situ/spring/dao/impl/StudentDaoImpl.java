package com.situ.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao{

	@Override
	public List<Student> findAll() {
		System.out.println("StudentDaoImpl.findAll()");
		return null;
	}
}
