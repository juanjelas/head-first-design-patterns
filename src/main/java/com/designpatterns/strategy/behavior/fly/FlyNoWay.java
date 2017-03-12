package com.designpatterns.strategy.behavior.fly;

public class FlyNoWay implements FlyBehaviour {

	public void fly() {
		System.out.println("No way to fly");
	}

}
