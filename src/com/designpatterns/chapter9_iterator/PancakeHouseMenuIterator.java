package com.designpatterns.chapter9_iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{

	private List<MenuItem> menu;
	private int position = 0;
	
	public PancakeHouseMenuIterator(List<MenuItem> menu) {
		this.menu = menu;
	}
	
	@Override
	public boolean hasNext() {
		return !(position >= menu.size() || menu.get(position) == null);
	}

	@Override
	public Object next() {
		MenuItem item = menu.get(position);
		position += 1;
		return item;
	}

}
