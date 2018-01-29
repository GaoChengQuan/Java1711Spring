package com.situ.spring.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.situ.spring.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	private IStudentService studentService;

	public void findAll() {
		System.out.println("StudentController.findAll()");
		studentService.findAll();
	}
}
