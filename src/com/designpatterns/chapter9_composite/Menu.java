package com.designpatterns.chapter9_composite;

import java.util.ArrayList;
import java.util.Iterator;

//Composite
public class Menu extends MenuComponent {

	ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComp) {
		menuComponents.add(menuComp);
	}
	
	public void remove(MenuComponent menuComp) {
		menuComponents.remove(menuComp);
	}
	
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.println("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}

	@Override
	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
}
