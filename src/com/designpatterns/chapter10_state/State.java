package com.designpatterns.chapter10_state;

public interface State {

	public void dispense();
	
	public void ejectQuarter();
	
	public void insertQuarter();
	
	public void turnCrank();
	
}
