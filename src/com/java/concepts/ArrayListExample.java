package com.java.concepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(43);
		list.add(2);
		list.add(89);
		
		
		System.out.println("Original list: "+list);
		
		Collections.reverse(list);
		System.out.println("Reverse list: "+list);
		
		Collections.sort(list);
		System.out.println("Asc Sorted list:"+list);
		
		System.out.println("Min in list: "+Collections.min(list));
		System.out.println("Max in list: "+Collections.max(list));
		
		Collections.reverse(list);
		System.out.println("Reverse list: "+list);
		
	

	}

}
