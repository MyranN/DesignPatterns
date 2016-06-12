package com.designpatterns.chapter4_abstract_factory;

public class CheesePizza extends Pizza{

	private PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	void prepare() {
		cheese = factory.createCheese();
		dough = factory.createDough();
		sauce = factory.createSauce();
	}

}
