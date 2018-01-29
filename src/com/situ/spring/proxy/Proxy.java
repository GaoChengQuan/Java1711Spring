package com.situ.spring.proxy;

public class Proxy implements ISubject{
	private RealSubject realSubject;
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void request() {
		System.out.println("开启事物");
		realSubject.request();
		System.out.println("关闭事物");
	}
}
