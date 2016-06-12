package com.designpatterns.chapter12_compound_patterns;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounterDecorator(new MallardDuck());
	}

	@Override
	public Quackable createRedHairDuck() {
		return new QuackCounterDecorator(new RedHairDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounterDecorator(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounterDecorator(new RubberDuck());
	}

}
