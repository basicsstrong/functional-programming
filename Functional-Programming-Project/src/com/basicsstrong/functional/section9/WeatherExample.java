package com.basicsstrong.functional.section9;

import java.util.ArrayList;
import java.util.List;

public class WeatherExample {

	public static void main(String[] args) {
		
		
		//Suppose we have a list of weather details of different cities across the globe. 
		//I have created this class city..
		//<Open City>

		List<City> CelciusWeather = new ArrayList<>();
		CelciusWeather.add(new City("Delhi", 16, 87, 8));   // In Celsius // In percentage // In km/hr		
		CelciusWeather.add(new City("Chicago", 4, 83, 19)); 
		CelciusWeather.add(new City("Beijing", 2, 74, 3));
		CelciusWeather.add(new City("Mexico City", 18, 63, 10));
		CelciusWeather.add(new City("Sydney", 20, 72, 21));
		
		//This data is having the temprature in Celcius, 
		//Humidity is in Percentage
		//and the wind is in Km per Hour
		
		
		//In some countries Fahrenheit is used as a Standard scale to measure the Temprature,
		//So the use case is
		//We have to convert all these tempratures from Celsius to Fahrenheit.
		
		
		CelciusWeather.stream()
		
		//now we have to map 
		.forEach((e) -> e.setTemprature((int)(e.getTemprature() * 1.8 +  32)));
		//.forEach((e) -> System.out.println(e));
		
		
		
		

	}

}

