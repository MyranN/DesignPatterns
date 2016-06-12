package com.designpatterns.chapter5_singleton;

public class Singleton {
	
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {};
	
	//double checked locking
	public static Singleton getInstance() {
		//Enter synchronized block if instance not initialized
		if (uniqueInstance == null) {
			//block is only ever entered once
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
