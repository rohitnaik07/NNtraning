package com.innerclass;

import com.innerclass.StaticOuter.StaticInner;

public class StaticClassDemo {

	public static void main(String[] args) {

		StaticOuter.staticClassMethod();
		StaticOuter.StaticInner.staticClassMethod();
		
		StaticInner staticInner= new StaticOuter.StaticInner();
		staticInner.staticClassInstanceMethod();
		
		StaticOuter staticOuter= new StaticOuter();
		staticOuter.outerStaticClassIntanceMethod();
		
	}

}
