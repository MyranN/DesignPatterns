package com.designpatterns.chapter4_abstract_factory;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
}
