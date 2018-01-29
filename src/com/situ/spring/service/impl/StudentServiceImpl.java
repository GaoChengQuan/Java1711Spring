package com.situ.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.entity.Student;
import com.situ.spring.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao studentDao;

	@Override
	public List<Student> findAll() {
		System.out.println("StudentServiceImpl.findAll()");
		studentDao.findAll();
		return null;
	}
}
