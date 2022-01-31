package com.collections;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class ListDemo {

	static Logger log= Logger.getLogger(ListDemo.class.getClass());
	public static void main(String[] args) {

		ArrayList arraylist= new ArrayList();//70kb
		System.out.println(arraylist.toString());
		AbstractList arraylist2= new ArrayList();//50kb
		AbstractCollection arraylist3= new ArrayList();//25kb
		
		List<Person> arraylist4= new ArrayList<Person>();//25kb
		Person person1= new Person("abc", 25);
		Person person2= new Person("xyz", 22);
		Employee employee1= new Employee("efg", 45, "manager", "tcs", 100000.50);
				
		
		arraylist4.add(person1);
		arraylist4.add(person2);
		arraylist4.add(employee1);
		//arraylist4.add(new Student());
		
		log.info(arraylist4);
		
		Iterator<Person> it= arraylist4.iterator();
		while(it.hasNext()){
			Person p= it.next();
			/*if(p.getName().equals("abc"))p.setAge(30);
			if(p.getName().equalsIgnoreCase("xyz"))p.setName("xyz updated");*/
			log.info(p.getName()+","+p.getAge());
		}

	}

}
