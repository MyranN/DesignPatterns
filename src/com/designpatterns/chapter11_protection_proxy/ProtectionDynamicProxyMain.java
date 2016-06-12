package com.designpatterns.chapter11_protection_proxy;

import java.lang.reflect.Proxy;

public class ProtectionDynamicProxyMain {

	public static void main(String[] args) {
		ProtectionDynamicProxyMain main = new ProtectionDynamicProxyMain();
		main.run();
	}

	private void run() {
		
		PersonBean joe = new PersonBeanImpl();
		joe.setGender("male");
		joe.setInterests("sport");
		joe.setName("joe");
		
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is: " + ownerProxy.getName());
		ownerProxy.setInterests("eating");
		try {
			ownerProxy.setHotOrNotRating(25);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is: " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("sleeping");
		} catch (Exception e) {
			System.out.println("Can't set interests from non-owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(25);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is: " + nonOwnerProxy.getHotOrNotRating());
	}
	
	
	private PersonBean getOwnerProxy(PersonBean person) {
		
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person)
				);
	}
	
	private PersonBean getNonOwnerProxy(PersonBean person) {
		
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person)
				);
	}
}
