package com.test.ex01.stategy;

public abstract class Duck {
	
	FlyBehavior flybehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flybehavior=fb;
	}
	
	public void setQuackBehavior(QuackBehavior qk){
		quackBehavior=qk;
	}
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flybehavior.fly();
	}
	
	public void swim(){
		System.out.println("all duck's can swim...!!");
	}

}
