package edu.pattern.observer;

import edu.pattern.observer.obsorver.CurrentConditionsDisplay;
import edu.pattern.observer.subject.WeatherData;

public class WeatherStation
{
	public static void main(String args[])
	{
		WeatherData weatherData= new WeatherData();
		CurrentConditionsDisplay currentisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.removeObsorver(currentisplay);
		weatherData.notifyObservers();
	}
}
