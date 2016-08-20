package com.java.concepts;

public class Inheritance {

	public static void main(String[] args) {
	
		Employee e = new Employee();
		e.id = 101;
		e.name = "QA";
		e.salary = 1000;
		
		Manager m = new Manager();
		m.id = 222;
		m.name = "MANAGER";
		m.salary = 2000;
		m.department = "IT";
		
		//This is valid - upcasting or implicit casting - e1 becomes a manager
		Employee e1 = m; 
		
		//The following - downcasting or explicit casting - m1 is assigned as e but e does not have department
		//How to make this work? A constructor to initialize m1.department??
		//Manager m1 = e;
		
		System.out.println("Employee details: " + e.getDetails());
		System.out.println("Manager details: " + m.getDetails());
		System.out.println("e1 details: " + e1.getDetails());
		
	}
}


