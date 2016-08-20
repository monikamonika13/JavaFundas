package com.java.concepts;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class AgeComparator implements Comparator {

	//compare by age. If age is same, compare by name
	public int compare(Object obj1, Object obj2) {
		
		Candidate can1 = (Candidate) obj1;
		Candidate can2 = (Candidate) obj2;
		if (can1.age < can2.age)
			return -1;
		else if (can1.age > can2.age)
			return 1;
		else 
			return 0;
	}
	
}
