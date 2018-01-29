package com.situ.spring.service.impl;

import org.springframework.stereotype.Service;

import com.situ.spring.entity.Student;
import com.situ.spring.service.IStudentService;
import com.sun.org.apache.bcel.internal.util.SecuritySupport;


public class StudentServiceImpl implements IStudentService {

	@Override
	public void save() {
		System.out.println("StudentServiceImpl.save()");
	}

	@Override
	public void update() {
		System.out.println("StudentServiceImpl.update()");
		int i = 3 / 0;
	}

	@Override
	public void delete() {
		System.out.println("StudentServiceImpl.delete()");
	}

	@Override
	public Student findById() {
		System.out.println("StudentServiceImpl.findById()");
		return null;
	}
}
