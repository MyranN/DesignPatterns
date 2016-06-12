package com.designpatterns.chapter8_template_method;

public abstract class CaffeineBeverageWithHook {

	final void prepareRecipeTemplateMethod() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondimentsHook())
			addCondiments();
	}

	//Hook method can be overridden by subclasses
	public boolean customerWantsCondimentsHook() {
		return true;
	}

	abstract void addCondiments();

	private void pourInCup() {
		System.out.println("Pour into cup.");
	}

	abstract void brew();

	private void boilWater() {
		System.out.println("Boiling water.");
	}
}
