package com.designpatterns.chapter3_decorator;

//Super-type of object to be decorated and decorator objects
public abstract class Beverage {
	
	String description = "Unknown beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
