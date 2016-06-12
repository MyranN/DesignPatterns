package com.designpatterns.chapter8_template_method;

public class TeaWithHook extends CaffeineBeverageWithHook{

	private String type = "TEA";
	public boolean customerWantsCondimentsHook() {
		//Some logic goes here
		return type == "COFFEE";
	}
	
	public void brew() {
		System.out.println("Steeping the tea.");
	}

	public void addCondiments() {
		System.out.println("Add lemon");
	}
}
