package com.designpatterns.chapter1_strategy;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
