package com.designpatterns.strategy.behavior.quack;

public class MuteQuack implements QuackBehaviour{

	public void quack() {
		System.out.println("<<Silence>>");
		
	}

}
