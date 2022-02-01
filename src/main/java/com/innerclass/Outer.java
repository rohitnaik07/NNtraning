package com.innerclass;

import org.apache.log4j.Logger;

public class Outer {

	static Logger log= Logger.getLogger(Outer.class.getClass());
	
	public Outer(){
		log.info("from Outer class constructor");
	}
	
	void outerClassMethod(){
		log.info("I am from outer class method");
	}
	
	
	
	class Inner{
		Inner(){
		 log.info("From Inner class constructor");
		}
		
		void innerClassMethod(){
			log.info("I am from Inner class method");
		}
	}
	
	
}
