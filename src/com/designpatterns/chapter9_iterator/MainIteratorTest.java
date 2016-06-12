package com.designpatterns.chapter9_iterator;

public class MainIteratorTest {
	
	public void printMenu(DinerMenu dinerMenu, PancakeHouseMenu pancakeMenu) {
		Iterator diner = dinerMenu.createIterator();
		Iterator pancake = pancakeMenu.createIterator();
		
		while(diner.hasNext()) {
			MenuItem item = (MenuItem)diner.next();
			System.out.println(item.getName());
			System.out.println(item.getDescription());
		}
		
		System.out.println("-------------");
		
		while(pancake.hasNext()) {
			MenuItem item = (MenuItem)pancake.next();
			System.out.println(item.getName());
			System.out.println(item.getDescription());
		}
	}
	
	public static void main(String[] args) {
		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		MainIteratorTest test = new MainIteratorTest();
		test.printMenu(dinerMenu, pancakeMenu);
	}
}
