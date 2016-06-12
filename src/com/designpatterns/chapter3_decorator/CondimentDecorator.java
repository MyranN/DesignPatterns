package com.designpatterns.chapter3_decorator;

//Super-type of all condiment decorator objects
public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();
}
