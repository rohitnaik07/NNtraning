package com.abstraction;

public  class Pulsar extends Bike{

	public Pulsar(){
		super();
		System.out.println("I am from default constructor of Pulsar class");
	}
	
	public String vehicleType(){
		return "two wheeler - pulsar";
	}
	
	public void printPulsardetails(){
		System.out.println("this is pulsar 150");
	}
}
