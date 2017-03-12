package com.designpatterns.builder;

public class UserSimulation {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Juanjo", "Sevillano").age(33).address("Madrid").build();
		System.out.println(user.toString());
	}
}
