package com.designpatterns.chapter12_compound_patterns;

public class QuackCounterDecorator implements Quackable{

	Quackable duck;
	private Observable observable;
	static int numberOfQuacks;
	
	public QuackCounterDecorator(Quackable duck) {
		this.duck = duck;
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		return duck.toString();
	}

}
