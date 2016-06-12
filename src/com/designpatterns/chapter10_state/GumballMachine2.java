package com.designpatterns.chapter10_state;

public class GumballMachine2 {

	State noQuarterState;
	State soldOutState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine2(int numOfGumballs) {
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		count = numOfGumballs;
		if(count > 0)
			state = noQuarterState;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	public int getCount() {
		return count;
	}
	
	public void releaseGumball() {
		System.out.println("A gumball comes rolling out...");
		if(count > 0){
			count -= 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}
}
