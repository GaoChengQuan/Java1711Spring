package com.situ.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

// <bean name="student" class="com.situ.spring.entity.Student"/>
//@Component("student") //工具类不属于任意一层
//@Controller("student")
//@Service("student")
//@Repository("student")
public class Student implements Serializable {
	private Integer id;
	private String name;
	private Integer age;
	//通过反射Field，赋值
	@Value("男")
	private String gender;
	private String address;
	// 引用类型注入：banji属性注入Banji对象
	// <property name="banji" ref="banji"/>
	@Resource(name="banji")
	private Banji banji;

	public Student() {
		System.out.println("Student.Student()");
	}

	public Student(Integer id, String name, Integer age, Banji banji) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.banji = banji;
		System.out.println("Student.Student() 111");
	}
	
	public Student(String id, String name, Integer age, Banji banji) {
		super();
		//this.id = id;
		this.name = name;
		this.age = age;
		this.banji = banji;
		System.out.println("Student.Student() 333");
	}
	
	public Student(String name, Integer id, Banji banji, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.banji = banji;
		System.out.println("Student.Student() 222");
	}

	//构造方法执行对象创建之后调用,init-method
	@PostConstruct
	public void init() {
		System.out.println("Student.init()");
	}

	//在销毁之前调用，destory-method
	@PreDestroy
	public void destory() {
		System.out.println("Student.destory()");
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

	//通过set方法赋值
	@Value("lisi")
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Banji getBanji() {
		return banji;
	}

	public void setBanji(Banji banji) {
		this.banji = banji;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", banji=" + banji + "]";
	}

}
