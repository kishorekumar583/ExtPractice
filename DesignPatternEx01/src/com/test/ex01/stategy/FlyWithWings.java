package com.test.ex01.stategy;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Am a fly behavior");
	}

}
