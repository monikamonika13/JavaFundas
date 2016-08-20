package com.java.concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ListIteratorExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Asia");
		list.add("Europe");
		list.add("Africa");
		list.add("Antartica");
		list.add("Americas");
		
		ListIterator<String> ltr = list.listIterator();
/*		System.out.println("List Iterator forward:");
		while (ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
*/
		System.out.println("\nNow backward:");
		while (ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		Iterator<String> itr = list.iterator();
		System.out.println("\nUsing Iterator:");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Iterator does not have a previous()
		
	}

}
