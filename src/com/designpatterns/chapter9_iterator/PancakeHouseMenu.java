package com.designpatterns.chapter9_iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{

	ArrayList<MenuItem> menu;
	
	public PancakeHouseMenu() {
		menu = new ArrayList<>();
		
		addItem("Pancake", "A pancake", true, 2.0);
		addItem("Eggs n Toast", "A slice of bread and an egg", true, 2.0);
		addItem("Beans", "A bean...a single bean", true, 2.0);
	}
	
	public void addItem(String name, String description, boolean veg, double price) {
		MenuItem menuItem = new MenuItem(name, description, veg, price);
		menu.add(menuItem);
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menu);
	}
	
	public ArrayList<MenuItem> getMenu() {
		return this.menu;
	}
}
