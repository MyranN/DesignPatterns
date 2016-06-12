package com.designpatterns.chapter1_strategy;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
