package com.test.ex01.stategy;

public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior=new Quack();
		flybehavior=new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("Am a millard Duck..!!");
	}

}
