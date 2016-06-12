package com.designpatterns.chapter8_template_method;

public class TemplateTester {

	public static void main(String[] args) {
		CaffeineBeverageWithHook tea = new TeaWithHook();
		CaffeineBeverageWithHook coffee = new CoffeeWithHook();
		tea.prepareRecipeTemplateMethod();
		System.out.println("----------");
		coffee.prepareRecipeTemplateMethod();
		
	}
}
