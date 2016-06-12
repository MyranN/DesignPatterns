package com.designpatterns.chapter1_strategy;

public class FlyNoWay implements FlyBehaviour{
	
	public void fly(){
		System.out.println("I can't fly");
	}
}
