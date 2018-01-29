package com.situ.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//传过来任意一个目标对象，产生对应的代理对象
public class ProxyFactory {
	private ProxyFactory() {
	}
	
	public static Object getProxyInstance(final Object target) {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), //指定当前目标对象使用类加载器
				target.getClass().getInterfaces(), //目标对象实现的接口的类型
				new InvocationHandler() { // 事件处理器
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开启事物");
						//target.method(args)
						Object returnValue = method.invoke(target, args);
						System.out.println("关闭事物");
						return returnValue;
					}
				});
	}
}
