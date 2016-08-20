package com.java.concepts;

import java.util.*;
import java.lang.*;

public class FindDuplicatesInArray {

	public void duplicateList() {
			
		String[] a = {"Giraffe","Pig","Fish","Monkey","Monkey","Fish"};
		
		Set<String> s = new HashSet<String>();
		for (int i=0;i<a.length;i++){
			if(!s.add(a[i]))
				System.out.println("Duplicate at index "+i +" with content "+a[i]);
		}
		Iterator itrs = s.iterator();
		
		System.out.println("\nContents of the set without duplicates: ");
		while (itrs.hasNext()) {
			System.out.println(itrs.next());
		}	
	}
	
	public static void main(String[] args) {
		//find dupicates in a list by moving the elements into a set
		FindDuplicatesInArray F = new FindDuplicatesInArray();
		F.duplicateList();
		
	}
}
