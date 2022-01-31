package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(121);
		list.add(124);
		list.add(123);
		list.add(120);
		list.add(121);
		list.add(124);
		list.add(123);
		
		System.out.println(list);
		
		LinkedList lList= new LinkedList();
		lList.add(120);
		lList.add(121);
		lList.add(124);
		lList.add(123);
		lList.add(120);
		lList.add(121);
		lList.add(124);
		lList.add(123);
		
		System.out.println(lList);
		
		Vector<Integer> vector= new Vector();
		vector.add(120);
		vector.add(121);
		vector.add(124);
		vector.add(123);
		vector.add(120);
		vector.add(121);
		vector.add(124);
		vector.add(123);
		
		System.out.println(vector);
		
		HashSet<Integer> set=new HashSet<>();	
		
		set.add(120);
		set.add(121);
		set.add(124);
		set.add(123);
		set.add(123);
		set.add(null);
		set.add(null);
		set.add(120);
		set.add(121);
		set.add(124);
		set.add(123);
		set.add(123);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		LinkedHashSet<Integer> lset= new LinkedHashSet<>();
		lset.add(120);
		lset.add(121);
		lset.add(124);
		lset.add(123);
		lset.add(null);
		lset.add(123);
		lset.add(null);
		lset.add(120);
		lset.add(121);
		lset.add(124);
		lset.add(123);
		lset.add(null);
		lset.add(123);
		lset.add(null);
		
		System.out.println(lset);
		
		
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		
		System.out.println(map);
		
	}

}
