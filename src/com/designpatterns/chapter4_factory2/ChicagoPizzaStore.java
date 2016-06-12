package com.designpatterns.chapter4_factory2;

import com.designpatterns.chapter4_factory2.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza;
		
		switch(type) {
			case "Pepperoni":
				pizza = new ChicagoPepperoniPizza();
				break;
			default:
				pizza = null;
		}
		
		return pizza;
	}

}
