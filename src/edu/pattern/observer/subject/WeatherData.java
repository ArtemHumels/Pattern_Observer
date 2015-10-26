package edu.pattern.observer.subject;

import java.util.ArrayList;
import java.util.List;

import edu.pattern.observer.obsorver.Obsorver;

public class WeatherData implements Observable
{
	private List<Obsorver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Obsorver o)
	{
		observers.add(o);
	}

	@Override
	public void removeObsorver(Obsorver o)
	{
		int i = observers.indexOf(o);
		if (i>=0)
		{
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers()
	{
		for (int i = 0; i< observers.size(); i++)
		{
			Obsorver observer = (Obsorver) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measureChanged()
	{
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressured)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressured;
		measureChanged();
	}
}
