package com.designpatterns.chapter9_composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

	Stack<Iterator<MenuComponent>> stack = new Stack<>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}
			else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent menuComp = (MenuComponent)iterator.next();
			if (menuComp instanceof Menu) {
				stack.push(menuComp.createIterator());
			}
			return menuComp;
		} else {
			return null;
		}
		
	}

}
