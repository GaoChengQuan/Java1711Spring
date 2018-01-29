package com.situ.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import com.sun.org.apache.regexp.internal.recompile;

//通知类，要增强的代码（事物、日志、权限）
public class MyAdvice {

	//前置通知
	//目标方法执行之前调用
	public void before() {
		System.out.println("这是前置通知");
	}
	
	//后置通知(如果出现异常不会调用)
	//在目标方法运行之后调用
	public void afterReturning() {
		System.out.println("这是后置通知(如果出现异常不会调用)");
	}
	
	//环绕通知
	//在目标方法之前和之后都调用
	public Object round(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知-之前的部分");
		Object proceed = pjp.proceed();//调用目标对象
		System.out.println("环绕通知-之后的部分");
		return proceed;
	}
	
	//异常通知：
	//如果出现异常，就会调用 
	public void afterException() {
		System.out.println("出事了！出现异常了");
	}
	
	//后置通知：
	//(无论是否出现异常都会调用)在目标方法执行之后调用
	public void after() {
		System.out.println("后置通知：(无论是否出现异常都会调用)在目标方法执行之后调用");
	}
}
