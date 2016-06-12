package com.designpatterns.chapter2_builtin_observer;

public class WeatherStationMain {

	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(20, 35, 110.4f);
		weatherData.setMeasurements(5, 47, 9.8f);
	}
}
