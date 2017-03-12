package com.designpatterns.strategy.invariant;

import com.designpatterns.strategy.behavior.fly.FlyWithWings;
import com.designpatterns.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Soy un Mallard");
		
	}

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	
	

}
