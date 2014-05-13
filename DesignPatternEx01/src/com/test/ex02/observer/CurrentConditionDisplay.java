package com.test.ex02.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temparature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	@Override
	public void display() {
		System.out.println("Current conditions" + temparature + "some thins"
				+ humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temparature = temp;
		this.humidity = humidity;
		display();
	}

	public void CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

}
