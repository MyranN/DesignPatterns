package com.designpatterns.chapter10_state;

public class NoQuarterState implements State {

	GumballMachine2 gumballMachine;
	
	public NoQuarterState(GumballMachine2 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void insertQuarter() {
		System.out.println("You've inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You've turned the crank but there's no quarter");
	}

}
