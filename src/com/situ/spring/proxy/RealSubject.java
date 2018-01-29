package com.situ.spring.proxy;

public class RealSubject implements ISubject{
	
	@Override
	public void request() {
		//System.out.println("开启事物");
		System.out.println("RealSubject.request()");
		//System.out.println("关闭事物");
	}
}
