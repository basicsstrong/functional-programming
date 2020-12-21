package com.basicsstrong.functional.section9;

public class City {
	
	//which has name of the city,
	//Temprature of the city in int
	//humidity 
	//and wind

	private String name;
	private int temprature;
	private int humidity; 
	private int wind; 
	
	//we have constructor to construct city objects

	public City(String name, int temprature, int humidity, int wind) {
		this.setName(name);
		this.setTemprature(temprature);
		this.setHumidity(humidity);
		this.setWind(wind);
	}
	
	//we have getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTemprature() {
		return temprature;
	}

	public void setTemprature(int temprature) {
		this.temprature = temprature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getWind() {
		return wind;
	}

	public void setWind(int wind) {
		this.wind = wind;
	}

	//And the toString to printout all the fields in a single String.
	@Override
	public String toString() {
		return "City [name=" + name + ", temprature=" + temprature + ", humidity=" + humidity + ", wind=" + wind + "]";
	}

}
