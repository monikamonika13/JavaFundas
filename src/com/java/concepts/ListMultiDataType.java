package com.java.concepts;

import java.util.ArrayList;
import java.util.List;

public class ListMultiDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<String>();
		
		list.add("X");
		list.add("Y"); 
		list.add(new int[10]); //will display the reference address of the int[10] object
		list.add(10); //will display 10
		System.out.println(list);

		List<String> list1 = new ArrayList<String>();
		
		list1.add("X");
		list1.add("Y"); 
//		list1.add(new int[10]); //unresolved compilation error
//		list1.add(10); //unresolved compilation error
		System.out.println(list1);
		
	}

}

