package com.designpatterns.chapter1_strategy;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
