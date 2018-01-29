package com.situ.spring.dao.impl;

import java.util.List;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.entity.Student;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public List<Student> findAll() {
		System.out.println("StudentDaoImpl.findAll()");
		return null;
	}

}
