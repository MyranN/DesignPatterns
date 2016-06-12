package com.designpatterns.chapter4_factory;

public class PizzaStoreMain {
	
	SimplePizzaFactory factory;
	
	public PizzaStoreMain(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.box();
		
		return pizza;
	}
}
