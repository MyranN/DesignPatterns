package com.designpatterns.chapter12_compound_patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlockComposite implements Quackable{

	List<Quackable> quackers = new ArrayList<>();
	
	public FlockComposite() {
	}
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
			quacker.notifyObservers();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
	}

}
