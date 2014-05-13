package com.test.ex01.stategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can Quack");
	}

}
