package com.designpatterns.chapter12_compound_patterns;

public class RubberDuck implements Quackable{

	private Observable observable;

	public RubberDuck() {
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak!");
		notifyObservers();
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
		return "RubberDuck";
	}

}
