package com.innerclass;

import org.apache.log4j.Logger;

public class MultipleBlocks {
	
	//Instance variables can be accessible only in instance type of blocks, ex: constructor, IIBs and instance methods
	int age=22;//this instance variable can be accessible in static type block also if we create the object for this class
	//static variables can be accessible in all the type of blocks, ex: constructor, IIBS, SIBS, instance methods and static methods also, thats why static variables can be called as universal variables
	static int  staticAge= 99; //class level scope
	static Logger log= Logger.getLogger(MultipleBlocks.class.getClass());
	
	public MultipleBlocks(){
		log.info(age);
		int myAge= 32;//local level scope
		log.info("from constructor for static variable::"+staticAge);
		//log.info(yourAge);
	}
	
	public void display(){
		log.info(age);
		//log.info(myAge);
		log.info("from display method for static variable::"+staticAge);
		int yourAge= 25; //local level scope
	}
	
	public  static void staticDisplay(){
		//log.info(age);//directly you cant access non static varibles in static type of blocks
		MultipleBlocks blocks = new MultipleBlocks();
		Integer marks=95;
		
		log.info(blocks.age);
		log.info(staticAge);
		//log.info(myAge);
		int yourAge= 25;
	}
	
	{
		log.info("From INSTANT INITIATION BLOCK 1::::"+age);
		log.info("from IIB1 block FOR STATIC MEMBERS::::"+staticAge);
	}
	
	{
		int iib2Age=10;
		log.info("From INSTANT INITIATION BLOCK 2::::"+age);
		log.info("from IIB2 block FOR STATIC MEMBERS::::"+staticAge);
	}
	
	static{
		//log.info(age);//directly you cant access non static varibles in static type of blocks
		MultipleBlocks blocks = new MultipleBlocks();
		log.info(blocks.age);
		log.info("from STATIC block 1::::"+staticAge);
	}
	static{
		log.info("from STATIC block 2::::"+staticAge);
	}
	
}
