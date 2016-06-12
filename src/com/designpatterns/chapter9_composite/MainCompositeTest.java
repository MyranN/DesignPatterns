package com.designpatterns.chapter9_composite;

import java.util.Iterator;

public class MainCompositeTest {

	MenuComponent allMenus;
	
	public MainCompositeTest(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void print() {
		allMenus.print();
	}
	
	public void printVegetarianMenuItems() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		while(iterator.hasNext()) {
			MenuComponent menuComp = (MenuComponent) iterator.next();
			
			if(menuComp.isVegetarian()) {
				menuComp.print();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MenuComponent pancakeHouseMenu = new Menu("PancakeHouseMenu", "Breakfast");
		MenuComponent dinerMenu = new Menu("DinerMenu", "Lunch");
		MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert");
		
		MenuComponent allMenus = new Menu("All Menus", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		
		dinerMenu.add(new MenuItem("Carbonara", "Pasta with carbonara sauce", false, 5.40));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Chocolate Ice Cream", "Ice cream", true, 2.00));
		
		MainCompositeTest test = new MainCompositeTest(allMenus);
		//test.print();
		
		//Test composite iterator
		test.printVegetarianMenuItems();
		
	}
}
