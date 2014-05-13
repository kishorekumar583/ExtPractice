package com.test.ex01.stategy;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't quack am in mute");
	}

}
