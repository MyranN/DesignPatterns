package com.designpatterns.chapter7_adapter;

public class WildTurkey implements Turkey{

	@Override
	public void fly() {
		System.out.println("Flying a short distance");
	}

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

}
