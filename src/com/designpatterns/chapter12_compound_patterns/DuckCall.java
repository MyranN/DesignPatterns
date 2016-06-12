package com.designpatterns.chapter12_compound_patterns;

public class DuckCall implements Quackable {
	Observable observable;
	
	public DuckCall() {
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak!");
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
		return "DuckCall";
	}

}
