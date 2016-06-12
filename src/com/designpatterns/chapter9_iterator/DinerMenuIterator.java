package com.designpatterns.chapter9_iterator;

public class DinerMenuIterator implements Iterator {

	MenuItem[] menu;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] menu) {
		this.menu = menu;
	}
	
	@Override
	public Object next() {
		MenuItem menuItem = menu[position];
		position+=1;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		return !(position >= menu.length || menu[position] == null);
	}

}
