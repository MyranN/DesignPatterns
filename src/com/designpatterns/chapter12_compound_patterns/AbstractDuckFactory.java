package com.designpatterns.chapter12_compound_patterns;

public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHairDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();

}
