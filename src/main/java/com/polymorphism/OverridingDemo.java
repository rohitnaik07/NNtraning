package com.polymorphism;

public class OverridingDemo {

	public static void main(String[] args) {

		SuperClass superCls= new SuperClass();
		superCls.method1(1);
		
		SubClass1 sub1= new SubClass1();
		sub1.method1(1);
		
		SubClass2 sub2= new SubClass2();
		sub2.method1(1);
		
		SuperClass sub2_1 =new SubClass2();
		sub2_1.method1(12);

		SubClass1 sub2_2=new SubClass2();
		sub2_2.method1(1);
		
		SuperClass sub2_3 =new SubClass1();
		System.out.println(sub2_3.toString());

		//SubClass1 sub =new SubClass1();
	}

}
