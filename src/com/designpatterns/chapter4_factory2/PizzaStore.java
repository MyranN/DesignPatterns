package com.designpatterns.chapter4_factory2;

import com.designpatterns.chapter4_factory2.Pizza;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
	
}
