package com.situ.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.entity.Student;
import com.situ.spring.web.StudentController;

public class SpringTest {
	@Test
	public void test1() {
		//得到IOC容器对象
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器中取出bean
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
	
	@Test
	public void test3() {
		//得到IOC容器对象
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器中取出bean
		Student student = (Student) context.getBean("student");
		//关闭容器，触发销毁方法。
		//close这个方法是ApplicationContext的子类ClassPathXmlApplicationContext
		//里面的方法
		context.close();
	}
	
	@Test
	public void test2() {
		//得到IOC容器对象
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器中取出bean
		Student student1 = (Student) context.getBean("student");
		Student student2 = (Student) context.getBean("student");
		System.out.println(student1 == student2);//true
	}
	
	@Test
	public void test4() {
		//得到IOC容器对象
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器中取出bean
		StudentController studentController =   (StudentController) context.getBean("studentController");
		studentController.findAll();
	}
}
