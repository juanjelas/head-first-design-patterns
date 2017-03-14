package com.designpatterns.adapter;

import com.designpatterns.adapter.elements.Duck;
import com.designpatterns.adapter.elements.MallardDuck;
import com.designpatterns.adapter.elements.WildTurkey;

public class AdapterSimulation {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says..");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The duck says...");
		testDuck(duck);
		
		System.out.println("The turkeyAdapter says..");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
