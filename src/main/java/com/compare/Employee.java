package com.compare;

public class Employee implements Comparable<Employee>{

	public String name;
	public Integer id;
	public Integer age;
	public Double salary;
	
	
	public Employee(){
		
	}
	
	public Employee(String empName, Integer empId, Integer empAge, Double empSalary){
		this.name=empName;
		this.id=empId;
		this.age= empAge;
		this.salary=empSalary;
	}
	
	public String toString(){
		return this.name+", "+this.id+", "+this.age+", "+this.salary;
		//return this.name;
	}
	public int compareTo(Employee emp){
		//int res= emp.id.compareTo(this.id);
		//=====================================
		int res= this.name.compareTo(emp.name);
		if (res != 0) return res;
		res= this.id.compareTo(emp.id);
		//=====================================
		return res;
	}
}
