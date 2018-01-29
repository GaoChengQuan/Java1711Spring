package com.situ.spring.service.impl;

import java.util.List;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.entity.Student;
import com.situ.spring.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao studentDao;

	public IStudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAll() {
		System.out.println("StudentServiceImpl.findAll()");
		studentDao.findAll();
		return null;
	}

}
