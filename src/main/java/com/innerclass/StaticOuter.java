package com.innerclass;

import org.apache.log4j.Logger;

public class StaticOuter {

	static Logger log= Logger.getLogger(StaticOuter.class.getClass());
	
	public StaticOuter(){
		log.info("from StaticOuter class constructor");
	}
	
	public static void staticClassMethod(){
		log.info("from StaticOuter class staticClassMethod() method");
	}
	
	public void outerStaticClassIntanceMethod(){
		log.info("from StaticOuter class outerStaticClassIntanceMethod() method");
	}
	
	static class StaticInner{
		
		StaticInner(){
			log.info("from StaticInner class constructor");
		}
		

		 static void staticClassMethod(){
			log.info("from StaticInner class staticClassMethod() method");
		}
		
		void staticClassInstanceMethod(){
			log.info("from StaticInner class staticClassInstanceMethod() method");
		}
		
	}
}
