package com.designpatterns.strategy.invariant;

import com.designpatterns.strategy.behavior.fly.FlyBehaviour;
import com.designpatterns.strategy.behavior.quack.QuackBehaviour;

public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public abstract void display();
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
}
