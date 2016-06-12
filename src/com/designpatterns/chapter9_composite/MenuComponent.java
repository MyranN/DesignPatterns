package com.designpatterns.chapter9_composite;

import java.util.Iterator;

//Leaf and Composite classes all inherit from MenuComponent to be treated uniformly
public abstract class MenuComponent {

	public void add(MenuComponent menuComp) {

	}

	public void remove(MenuComponent menuComp) {

	}

	public MenuComponent getChild(int i) {
		return null;
	}

	public String getName() {
		return "";
	}

	public String getDescription() {
		return "";
	}

	public double getPrice() {
		return 0.0;
	}

	public boolean isVegetarian() {
		return false;
	}

	public void print() {

	}
	
	public abstract Iterator<MenuComponent> createIterator();
}
