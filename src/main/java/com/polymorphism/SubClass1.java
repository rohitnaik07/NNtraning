package com.polymorphism;

public class SubClass1 extends SuperClass{//11 methods 9+1+1

	public void method1(int a){
	    a=10+2;
		System.out.println("I am from subclass1  method1()"+a);
	}
	
	public void subclass1Method(){
		System.out.println("I am from subclass1  subclass1Method()");
	}
	
	public String toString() {
		return "I am from toString method of SubClass1";
    }
}
