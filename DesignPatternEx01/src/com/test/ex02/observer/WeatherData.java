package com.test.ex02.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temparature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(0);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(0);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temparature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temparature, float humidity,
			float pressure) {
		this.temparature = temparature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	// Other weather data methods here
}
