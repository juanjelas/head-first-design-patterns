package com.designpatterns.adapter;

import com.designpatterns.adapter.elements.Duck;
import com.designpatterns.adapter.elements.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
