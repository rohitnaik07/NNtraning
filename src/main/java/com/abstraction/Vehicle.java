package com.abstraction;

public abstract class Vehicle {

	String engineModel=null;
	
	public Vehicle(){
		
		System.out.println("I am from Vehicle class constructor");
	}
	
	public Vehicle(String name, String engineModel){
		super();
		this.engineModel=engineModel;
		System.out.println("I am from Vehicle class parameterized constructor and vehicle Type is::::"+name);
	}

	public abstract String vehicleType();
	
	public String getEngineModel(){
		return engineModel;
	}
}
