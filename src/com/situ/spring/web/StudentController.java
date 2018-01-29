package com.situ.spring.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.situ.spring.service.IStudentService;

// <bean name="studentController" class="com.situ.spring.web.StudentController"/>
@Controller("studentController")
public class StudentController {
	//private IStudentService studentService = new StudentServiceImpl();
	@Resource(name="studentService")
	private IStudentService studentService;

	public void findAll() {
		System.out.println("StudentController.findAll()");
		studentService.findAll();
	}
}
