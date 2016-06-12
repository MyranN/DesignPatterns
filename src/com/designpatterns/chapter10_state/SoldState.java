package com.designpatterns.chapter10_state;

public class SoldState implements State{

	GumballMachine2 gumballMachine;
	
	public SoldState(GumballMachine2 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		gumballMachine.releaseGumball();
		if(gumballMachine.getCount() > 0)
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		else
			System.out.println("No more gumballs.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
			
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, the crank has already been turned");
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait...we're already giving you a gumball");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

}
