package com.java.concepts;

import java.util.LinkedList;
import java.util.Iterator;

public class ListExample {
	
	public void learnlinkedlist() {
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("Giraffe");
		llist.add("Pig");
		llist.add("Fish");
		llist.add("Monkey");
		
		Iterator itr = llist.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		
		ListExample ex = new ListExample();
		ex.learnlinkedlist();
		
	}
}
