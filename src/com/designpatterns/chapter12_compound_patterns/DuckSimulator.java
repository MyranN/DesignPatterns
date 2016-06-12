package com.designpatterns.chapter12_compound_patterns;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
	
	public void simulate(AbstractDuckFactory factory) {
		Quackable mallard = factory.createMallardDuck();
		Quackable redHair = factory.createRedHairDuck();
		Quackable duckCall = factory.createDuckCall();
		Quackable rubberDuck = factory.createRubberDuck();
		Quackable goose = new QuackCounterDecorator(new GooseAdapter(new Goose()));
		
		System.out.println("\nDuck Simulator with Composite - Flock");
		
		FlockComposite flock = new FlockComposite();
		flock.add(mallard);
		flock.add(redHair);
		flock.add(duckCall);
		flock.add(rubberDuck);
		flock.add(goose);
		
		Quackable mallard1 = factory.createMallardDuck();
		Quackable mallard2 = factory.createMallardDuck();
		FlockComposite mallardFlock = new FlockComposite();
		mallardFlock.add(mallard1);
		mallardFlock.add(mallard2);		

		flock.add(mallardFlock);		
		
		System.out.println("\nQuackologist Observer");
		Quackologist quackologist = new Quackologist();
		flock.registerObserver(quackologist);
		
		simulate(flock);
		
		System.out.println("Number of Quacks: " + QuackCounterDecorator.getQuacks());
	}
	
	public void simulate(Quackable duck) {
		duck.quack();
	}
}
