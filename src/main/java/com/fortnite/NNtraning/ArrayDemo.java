package com.fortnite.NNtraning;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		Integer empAges[]= new Integer[]{21,22,20,30,28,33,1,3};
		
		for(int i=0; i<empAges.length;i++){
			System.out.print(empAges[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("Before sorting array is:::"+Arrays.toString(empAges));
		
		//Arrays.sort(empAges);
		
		Arrays.sort(empAges,4,8);
		
		System.out.println("After sorting array is:::"+Arrays.toString(empAges));
		
		System.out.println(Arrays.binarySearch(empAges, 30));
		
		for(int i=0; i<empAges.length;i++){
			if(30==empAges[i]){
				System.out.println("element found at "+i);
			}
			
		}
		
		ArrayList empAgesList= new ArrayList();
		
		empAgesList.add(21);
		empAgesList.add(22);
		
		empAgesList.add(20);
		
		//ArrayList empAgesList=new ArrayList( Arrays.asList(empAges));
		empAgesList.add(100);
		empAgesList.remove(1);
		
		System.out.println(empAgesList);
		
		//empAges= (Integer[]) empAgesList.toArray();
		
	
		//System.out.println("final array is:::"+Arrays.toString(empAges));
		
		
		 int intArr[] = { 10, 20, 15, 22, 35 };
		 
	        // Get the second Array
	        int intArr1[] = { 10, 20, 15, 22, 35};
	 
	        // To compare both arrays
	        System.out.println("Integer Arrays on comparison: "
	                           + Arrays.equals(intArr, intArr1));
	}

}
