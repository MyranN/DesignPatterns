package com.designpatterns.chapter4_abstract_factory;

public class PizzaStoreMain {
	
	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chStore = new ChicagoPizzaStore();
		
		Pizza pizza1 = nyStore.orderPizza("cheese");
		Pizza pizza2 = chStore.orderPizza("Cheese");
		
	}
}
