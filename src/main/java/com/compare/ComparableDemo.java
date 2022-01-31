package com.compare;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableDemo {

	static Logger log = Logger.getLogger(ComparableDemo.class.getClass());

	public static void main(String[] args) {

		Employee empOne= new Employee("Roger",101,22, 25000.0);
		Employee empTwo= new Employee("Rohit",102,21, 24000.0);
		Employee empThree= new Employee("Arbaaz",103, 26, 31000.20);
		Employee empFour= new Employee("Gowthami",105,24, 27000.0);
		Employee empFive= new Employee("Sangeetha",104,23, 28000.0);
		
		
		ArrayList<Employee> empList= new ArrayList<>();
		empList.add(empOne);
		empList.add(empTwo);
		empList.add(empThree);
		empList.add(empFour);
		empList.add(empFive);

		log.info("BEFORE SORTING==========");
		log.debug("BEFORE SORTING==========");
		log.error("BEFORE SORTING==========");
		//System.out.println("BEFORE SORTING==========");
		Iterator<Employee> iterator= empList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//System.out.println("Before sorting "+empList);
		//Collections.sort(empList);
		
		//System.out.println("After sorring "+empList);
		System.out.println("AFTER SORTING =============");
		Iterator<Employee> iteratorSorting= empList.iterator();
		while(iteratorSorting.hasNext()){
			System.out.println(iteratorSorting.next());
		}
	}

}
