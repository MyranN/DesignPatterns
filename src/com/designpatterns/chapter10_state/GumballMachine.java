package com.designpatterns.chapter10_state;

public class GumballMachine {

	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	public void insertQuarter() {
		if (state == HAS_QUARTER)
			System.out.println("Cannot insert another quarter");
		else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You've entered a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Gumball has already  been dispensed..please wait");
		}
	}
	
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			state = NO_QUARTER;
			System.out.println("Quarter has been returned");
		} else if (state == NO_QUARTER) {
			System.out.println("A quarter has not been inserted");
		} else if (state == SOLD_OUT) {
			System.out.println("No quarter inserted, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Gumball has already  been dispensed");
		}
	}
	
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn't give you another gumball");
		} else if (state == NO_QUARTER) {
			System.out.println("Please insert a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("The machine is sold out");
		} else if (state == HAS_QUARTER) {
			System.out.println("You turned");
			state = SOLD;
			dispense();
		}
	}
	
	public void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out of the slot");
			count = count - 1;
			if (count == 0) {
				System.out.println("No more gumballs");
				state = SOLD_OUT;
			}else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("Please insert a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}
}
