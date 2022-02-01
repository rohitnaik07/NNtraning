package com.innerclass;

import org.apache.log4j.Logger;

public class LocalOuterClass {

	static Logger log= Logger.getLogger(LocalOuterClass.class.getClass());
	
	public LocalOuterClass(){
		log.info("from LocalOuterClass class constructor");
	}
	String name="outerLocalClass instance variable";
	
	public void display(){
		
		log.info(name);
		
		String localName= "outerLocalClass local variable";
		
		class LocalInner{
			LocalInner(){
				log.info("from LocalInner class constructor");
			}
			
			
			void innerDisplay(){
				log.info("from LocalInner class instance method");
			}
		}
		
		LocalInner localInner= new LocalInner();
		localInner.innerDisplay();
		
	}
}
