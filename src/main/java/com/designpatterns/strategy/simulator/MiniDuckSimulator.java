package com.designpatterns.strategy.simulator;

import com.designpatterns.strategy.invariant.Duck;
import com.designpatterns.strategy.invariant.MallardDuck;

public class MiniDuckSimulator {
	
	public static void main(String... args){
		Duck mallar = new MallardDuck();
		mallar.performFly();
		mallar.performQuack();
	}
}
