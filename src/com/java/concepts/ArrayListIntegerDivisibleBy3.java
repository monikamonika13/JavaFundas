package com.java.concepts;

import java.util.ArrayList;

/*
Create an ArrayList of Integers. 
Check which in the list is divisible by 3
*/

public class ArrayListIntegerDivisibleBy3 {

	public static void main(String[] args) {
		
		// create an arraylist object
		// If user should input these numbers, then we need to use Scanner Class
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		aList.add(183);
		aList.add(324);
		aList.add(242);
		aList.add(565);
		aList.add(2041);
		aList.add(30);
		
		
		// Verify if element in list is divisible by 3 using for.. loop
		// The % operator gives the remainder of the operation
		System.out.print("Numbers in the list that are divisible by 3:");
		for (Integer it: aList) {
			if (it%3 == 0) {
			System.out.print(" "+it);
			} //end if
		} // end for
		
	}
}
