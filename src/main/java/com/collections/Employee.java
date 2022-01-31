package com.collections;

public class Employee extends Person{

	
	public String designation;
	public String orgName;
	public Double salary;
	
	public Employee(String name, Integer age, String designation, String orgName,Double salary) {
		super(name, age);
		this.designation=designation;
		this.orgName=orgName;
		this.salary= salary;
		
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
