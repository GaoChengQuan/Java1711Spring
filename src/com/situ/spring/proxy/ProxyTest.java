package com.situ.spring.proxy;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.ISUB;

public class ProxyTest {

	public static void main(String[] args) {
		RealSubject dongShiZhang = new RealSubject();
		dongShiZhang.request();
	}
	
	@Test
	public void test1() {
		RealSubject dongShiZhang = new RealSubject();
		Proxy miShu = new Proxy(dongShiZhang);
		miShu.request();
		
		ISubject subject = new Proxy(dongShiZhang);
		subject.request();
	}
	
	@Test
	public void test2() {
		ISubject subject = new RealSubject();
		ISubject proxy = (ISubject) ProxyFactory.getProxyInstance(subject);
		proxy.request();
	}
}
