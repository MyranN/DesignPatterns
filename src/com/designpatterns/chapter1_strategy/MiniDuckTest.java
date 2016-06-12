package com.designpatterns.chapter1_strategy;

public class MiniDuckTest {

	public static void main(String[] args){
		
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFly(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
