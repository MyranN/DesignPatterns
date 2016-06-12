package com.designpatterns.chapter10_state;

import java.util.Random;

public class HasQuarterState implements State{

	Random random = new Random(System.currentTimeMillis());
	GumballMachine2 gumballMachine;
	
	public HasQuarterState(GumballMachine2 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned....");
		int winner = random.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1))
			gumballMachine.setState(gumballMachine.getWinnerState());
		else
			gumballMachine.setState(gumballMachine.getSoldState());
	}
	
	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}