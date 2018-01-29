package com.situ.spring.dao;

import java.util.List;

import com.situ.spring.entity.Student;

public interface IStudentDao {
	public List<Student> findAll();
}
