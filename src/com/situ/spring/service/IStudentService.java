package com.situ.spring.service;

import java.util.List;

import org.apache.coyote.http11.filters.VoidInputFilter;
import org.junit.validator.PublicClassValidator;

import com.situ.spring.entity.Student;

import sun.net.www.content.text.plain;

public interface IStudentService {
	public void save();
	public void update();
	public void delete();
	public Student findById();
}
