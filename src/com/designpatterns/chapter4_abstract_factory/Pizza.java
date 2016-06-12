package com.designpatterns.chapter4_abstract_factory;

public abstract class Pizza {

	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	abstract void prepare();
	
	void bake() {
	}
	
	void box() {
	}
	
	
}
