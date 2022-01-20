package com.polymorphism;

public class SubClass2 extends SubClass1{//12 methods(9+2+1)

	public void method1(int a){
	    a=a+10+2;
		System.out.println("I am from subclass2  method1()"+a);
	}
	
	public void subclass2Method(){
		System.out.println("I am from subclass2Method  subclass1Method()");
	}
}
