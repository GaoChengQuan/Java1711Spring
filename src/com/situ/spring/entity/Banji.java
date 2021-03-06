package com.situ.spring.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("banji")
public class Banji {
	private Integer id;
	private String name;
	private List<Course> courseList = new ArrayList<Course>();

	private List<Student> list = new ArrayList<Student>();
	
	public Banji() {
		super();
	}

	public Banji(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Value("Java1711")
	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Banji [id=" + id + ", name=" + name + ", courseList=" + courseList + ", list=" + list + "]";
	}

}
