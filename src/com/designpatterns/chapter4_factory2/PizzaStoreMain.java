package com.designpatterns.chapter4_factory2;

public class PizzaStoreMain {
	
	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chStore = new ChicagoPizzaStore();
		
		Pizza pizza1 = nyStore.orderPizza("Pepperoni");
		Pizza pizza2 = chStore.orderPizza("Pepperoni");
		
		System.out.println(pizza1 instanceof ChicagoPepperoniPizza);
	}
}
