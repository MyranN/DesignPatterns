package com.designpatterns.chapter3_decorator;

public class CoffeeHouseMain {

	public static void main(String[] args){
		Beverage beverage = new Espresso();
		System.out.println("Description: " + beverage.getDescription() + 
				" Cost: £" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new MochaCondiment(beverage2);
		beverage2 = new MochaCondiment(beverage2);
		beverage2 = new WhipCondiment(beverage2);
		System.out.println("Description: " + beverage2.getDescription() + 
				" Cost: £" + beverage2.cost());
	}
}
