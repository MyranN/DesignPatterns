package com.designpatterns.chapter10_state;

public class SoldOutState implements State{

	GumballMachine2 gumballMachine;
	
	public SoldOutState(GumballMachine2 gumbMachine) {
		this.gumballMachine = gumbMachine;
	}
	
	@Override
	public void dispense() {
		System.out.println("Gumballs are sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("No quarter inserted, the gumballs are sold out");
	}

	@Override
	public void insertQuarter() {
		System.out.println("Gumballs are sold out");
	}

	@Override
	public void turnCrank() {
		System.out.println("Gumballs are sold out");
	}

}
