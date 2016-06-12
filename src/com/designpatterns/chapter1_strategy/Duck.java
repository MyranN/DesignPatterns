package com.designpatterns.chapter1_strategy;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void setFly(FlyBehaviour fly){
		flyBehaviour = fly;
	}
	
	public void setQuack(QuackBehaviour quack){
		quackBehaviour = quack;
	}
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("All ducks swim");
	}
}
