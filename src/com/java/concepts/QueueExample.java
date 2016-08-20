package com.java.concepts;

import java.util.PriorityQueue;
import java.util.Stack;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st = new Stack<String>();
		st.add("Orange");
		st.add("Mango");
		st.add("Banana");
		st.add("Watermelon");	
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.addAll(st);
		q.add("Apples");
		//Accessing each element in queue using for loop
		for (String eachQueueElement : q)
		{
			System.out.println(eachQueueElement);
		}
		System.out.println("-----------------------");
		System.out.println("Queue size: " + q.size());
		System.out.println("Hashcode : " + q.hashCode());
		q.add("Strawberry");
		st.remove("Mango");
		System.out.println("Peek(): " + q.peek());//FIFO - so peek gives 1st element - Apple
		System.out.println("RetainAll that is in st: " + q.retainAll(st)); //removes Apple, Strawberry, Mango
		System.out.println("-----------------------");
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	
	}

}
