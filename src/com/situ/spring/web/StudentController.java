package com.situ.spring.web;

import com.situ.spring.service.IStudentService;

public class StudentController {
	//private IStudentService studentService = new StudentServiceImpl();
	private IStudentService studentService;

	public IStudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	public void findAll() {
		System.out.println("StudentController.findAll()");
		studentService.findAll();
	}
}
