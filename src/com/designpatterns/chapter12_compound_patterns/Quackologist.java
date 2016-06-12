package com.designpatterns.chapter12_compound_patterns;

public class Quackologist implements Observer{

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked!");
	}

}
