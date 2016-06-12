package com.designpatterns.chapter4_factory2;


public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza;
		
		switch(type) {
			case "Pepperoni":
				pizza = new NYPepperoniPizza();
				break;
			default:
				pizza = null;
		}
		
		return pizza;
	}

}
