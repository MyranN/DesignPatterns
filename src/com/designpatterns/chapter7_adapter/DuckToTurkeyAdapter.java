package com.designpatterns.chapter7_adapter;

public class DuckToTurkeyAdapter implements Duck{

	private Turkey turkey;
	
	public DuckToTurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

}
