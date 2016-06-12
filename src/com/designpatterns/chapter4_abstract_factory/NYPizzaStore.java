package com.designpatterns.chapter4_abstract_factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
		}
		
		return pizza;
	}
}
