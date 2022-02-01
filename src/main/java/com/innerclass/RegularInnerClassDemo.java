package com.innerclass;

import com.innerclass.Outer.Inner;

public class RegularInnerClassDemo {

	public static void main(String[] args) {

		Outer outer= new Outer();
		outer.outerClassMethod();
		
		Inner inner= outer.new Inner();
		inner.innerClassMethod();
		
	}
}
