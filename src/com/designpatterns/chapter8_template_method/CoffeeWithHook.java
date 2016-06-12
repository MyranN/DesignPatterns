package com.designpatterns.chapter8_template_method;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	private String type = "COFFEE";
	public boolean customerWantsCondimentsHook() {
		//Some logic goes here
		return type == "COFFEE";
	}
	
	public void brew() {
		System.out.println("Dripping coffee through filter.");
	}

	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
}
