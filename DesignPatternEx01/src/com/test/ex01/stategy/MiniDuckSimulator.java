package com.test.ex01.stategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck kishore = new KishoreDuck();
		kishore.performFly();
		kishore.setFlyBehavior(new FlyWithWings());
		kishore.performFly();
		kishore.performQuack();
		kishore.setQuackBehavior(new MuteQuack());
		kishore.performQuack();
		
		
	}
}
