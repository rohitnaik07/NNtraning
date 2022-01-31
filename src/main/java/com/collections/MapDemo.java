package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

public class MapDemo {
	
	static Logger log = Logger.getLogger(MapDemo.class.getClass());

	public static void main(String[] args) {

		Map<String, Person> map = new TreeMap<String, Person>();
		Person person1= new Person("abc", 25);
		Person person2= new Person("xyz", 22);
		Employee employee1= new Employee("efg", 45, "manager", "tcs", 100000.50);
		
		map.put("abc", person1);
		map.put("xyz", person2);
		map.put("efg", employee1);
		
		//Person p= map.get("xyz");
		//log.info(p.getName()+", "+p.getAge());

		Set<String> keyset=  map.keySet();
		log.info(keyset);
		
		Iterator<String> it= keyset.iterator();
		while(it.hasNext()){
			String name = it.next();
			
			Person psn = map.get(name);
			if(psn.getName().equals("abc"))psn.setAge(30);
			if(psn.getName().equalsIgnoreCase("xyz"))psn.setName("xyz updated");
			
			log.info(psn.getName()+", "+psn.getAge());
			
		}
	
		/*Map.Entry<String, Person> entrySet=   (Entry<String, Person>) map.entrySet();
		log.info(entrySet);*/
		
		for (Map.Entry<String, Person> mapEntry : map.entrySet()) {
			
			String entryKey= mapEntry.getKey();
			Person entryValue= mapEntry.getValue();
			
			log.info(entryKey+", "+entryValue.getName()+", "+entryValue.getAge());
		}
	}
}
