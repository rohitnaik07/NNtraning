package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {

	public static void main(String[] args) {

		Student stdOne= new Student("Roger",101,22, 25000.0);
		Student stdTwo= new Student("Rohit",103,21, 24000.0);
		Student stdThree= new Student("Arbaaz",105, 26, 31000.20);
		Student stdFour= new Student("Gowthami",102,24, 27000.0);
		Student stdFive= new Student("Sangeetha",104,23, 28000.0);
		
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(stdOne);
		studentList.add(stdTwo);
		studentList.add(stdThree);
		studentList.add(stdFour);
		studentList.add(stdFive);
		
		Iterator<Student> studentIterator= studentList.iterator();
		System.out.println("BEFORE SORTING==============");
		while(studentIterator.hasNext()){
			System.out.println(studentIterator.next());
		}
		StundentIdCompare studentIdCompareObject =new StundentIdCompare();
		Collections.sort(studentList, studentIdCompareObject);
		
		System.out.println("AFTER SORTING==============");
		Iterator<Student> studentIteratorSorting= studentList.iterator();
		while(studentIteratorSorting.hasNext()){
			System.out.println(studentIteratorSorting.next());
		}
		
		
		Collections.sort(studentList, new StundentNameCompare());
		
		System.out.println("AFTER name SORTING==============");
		Iterator<Student> studentIteratorNameSorting= studentList.iterator();
		while(studentIteratorNameSorting.hasNext()){
			System.out.println(studentIteratorNameSorting.next());
		}
		
	}
	

}
