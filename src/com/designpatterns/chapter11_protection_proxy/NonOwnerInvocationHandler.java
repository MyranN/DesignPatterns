package com.designpatterns.chapter11_protection_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler{

	private PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		try {
			if (method.getName().startsWith("get"))
				return method.invoke(person, args);
			else if (method.getName().equals("setHotOrNotRating"))
				return method.invoke(person, args);
			else if (method.getName().startsWith("set"))
				throw new IllegalAccessException();
		} catch (InvocationTargetException ite) {
			ite.printStackTrace();
		}
		
		return null;
	}

}
