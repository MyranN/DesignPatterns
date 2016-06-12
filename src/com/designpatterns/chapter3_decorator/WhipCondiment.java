package com.designpatterns.chapter3_decorator;

public class WhipCondiment extends CondimentDecorator{

	Beverage beverage;
	
	public WhipCondiment(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.59;
	}

}
