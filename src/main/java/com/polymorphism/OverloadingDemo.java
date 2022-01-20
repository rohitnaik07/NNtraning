package com.polymorphism;

public class OverloadingDemo {

	public static void main(String[] args) {

		Calculate cal= new Calculate();
		cal.multiply(10, 20);
		cal.multiply(10.2, 20.3);
		cal.multiply(10.2, 5);
		cal.multiply(10, 5.5);
	}
}
