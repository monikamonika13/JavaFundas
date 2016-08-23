package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfListOfStrings {

	//Question 1 - List of List of Strings
	public static void ListOfListStringExample() {
		ArrayList<ArrayList<String>> superList = new ArrayList<ArrayList<String>>();
		ArrayList<String> singleList1 = new ArrayList<String>();
		ArrayList<String> singleList2 = new ArrayList<String>();
		singleList1.add("apples");
		singleList1.add("mangoes");
		singleList1.add("oranges");
		singleList1.add("grapes");
		superList.add(singleList1);
		singleList2.add("one");
		singleList2.add("two");
		superList.add(singleList2);
		
		Iterator<ArrayList<String>> itrsuper = superList.iterator();
		while (itrsuper.hasNext()) {
			Iterator<String> itr = itrsuper.next().iterator();
			while (itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfListStringExample();
	}

}
