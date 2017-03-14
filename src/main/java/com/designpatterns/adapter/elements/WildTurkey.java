package com.designpatterns.adapter.elements;

public class WildTurkey implements Turkey {

	public void gobble() {
		System.out.println("Gobble");

	}

	public void fly() {
		System.out.println("Fly short instance");
	}

}
