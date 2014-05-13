package com.test.ex01.stategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I cant fly");
	}

}
