package com.designpatterns.chapter12_compound_patterns;

public interface QuackObservable {

	public void registerObserver(Observer observer);
	public void notifyObservers();
	
}
