package com.designpatterns.chapter12_compound_patterns;

public class DuckFactory extends AbstractDuckFactory{

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHairDuck() {
		return new RedHairDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
