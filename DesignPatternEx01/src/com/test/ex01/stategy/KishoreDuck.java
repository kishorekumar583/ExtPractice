package com.test.ex01.stategy;

public class KishoreDuck extends Duck {

	public KishoreDuck(){
		flybehavior=new FlyNoWay();
		quackBehavior=new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("In Kishore Duck");
	}

}
