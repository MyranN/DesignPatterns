package com.designpatterns.chapter10_state;

public class WinnerState implements State {

	GumballMachine2 gumballMachine;
	
	public WinnerState(GumballMachine2 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		System.out.println("You're a winner. You get two gumballs.");
		gumballMachine.releaseGumball();
		if(gumballMachine.getCount() == 0)
			gumballMachine.setState(gumballMachine.getSoldOutState());
		else {
			gumballMachine.releaseGumball();
			if (gumballMachine.getCount() >= 0)
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			else
				gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		
	}

	//Other methods are same as sold state
	@Override
	public void ejectQuarter() {
		
	}

	@Override
	public void insertQuarter() {
		
	}

	@Override
	public void turnCrank() {
		
	}

}
