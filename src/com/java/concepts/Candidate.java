package com.java.concepts;

import java.util.ArrayList;
import java.util.Collections;
import com.java.concepts.AgeComparator;

@SuppressWarnings("rawtypes")
public class Candidate implements Comparable {

	int id;
	String name;
	int age;
	
	Candidate (int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//compare by age. If age is same, compare by name
	public int compareTo(Object obj) {
		
		Candidate can = (Candidate) obj; //typecasting
		if (age < can.age)
			return -1;
		else if (age > can.age)
			return 1;
		else if (name.compareTo(can.name) < 1)
			return -1;
			else if (name.compareTo(can.name) > 1)
				return 1;
			else
			return 0;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Candidate> canList = new ArrayList<>();
		
		Candidate c1 = new Candidate(5,"Brian", 40);
		Candidate c2 = new Candidate(1,"Henry", 23);
		Candidate c3 = new Candidate(3,"Sahana", 35);
		Candidate c4 = new Candidate(2,"Mohan", 35);
		Candidate c5 = new Candidate(4,"Adele", 40);
		
		canList.add(c1);
		canList.add(c2);
		canList.add(c3);
		canList.add(c4);
		canList.add(c5);
		
		//Now canList is not a primitive datatype. 
		//So need to implement a compareTo method for the following to work
		System.out.println("Using Age-Name java.lang.Comparable");
		Collections.sort(canList);
		for(Candidate c: canList)
		{
			System.out.println(c.id +" " +c.name +" " +c.age);
		}
		
		System.out.println("----------------------");
		//Using Comparator
		System.out.println("Using java.util.Comparator");
		Collections.sort(canList, new AgeComparator());
		for(Candidate c: canList)
		{
			System.out.println(c.id +" " +c.name +" " +c.age);
		}	
		
	}
}

