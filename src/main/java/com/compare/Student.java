package com.compare;

public class Student {

	public String name;
	public Integer id;
	public Integer age;
	public Double grade;
	
	
	public Student(){
		
	}
	
	public Student(String empName, Integer empId, Integer empAge, Double grade){
		this.name=empName;
		this.id=empId;
		this.age= empAge;
		this.grade=grade;
	}
	
	public String toString(){
		return this.name+", "+this.id+", "+this.age+" and "+this.grade;
	}
}
