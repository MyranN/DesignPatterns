package com.designpatterns.chapter3_decorator;

public class MochaCondiment extends CondimentDecorator{

	Beverage beverage;
	
	public MochaCondiment(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
