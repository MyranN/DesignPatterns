package com.designpatterns.chapter9_iterator;

public class DinerMenu implements Menu{

	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	MenuItem[] menu;
	
	public DinerMenu() {
		menu = new MenuItem[MAX_ITEMS];
		
		addItem("Pasto", "Like pasta", true, 2.9);
		addItem("Curro", "Like a curry", false, 4.5);
		addItem("Figs n Cheese", "Like fish and chips", false, 5);
	}
	
	public void addItem(String name, String description, boolean veg, double price) {
		MenuItem item = new MenuItem(name, description, veg, price);
		if (numOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, the menu is full");
		} else {
			menu[numOfItems++] = item;
		}
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menu);
	}
	
	public MenuItem[] getMenu() {
		return menu;
	}
	
}
