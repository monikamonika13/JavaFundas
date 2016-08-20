package com.java.concepts;

public class InheritanceTestObject {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e.toString());
		
		Manager m = new Manager();
		System.out.println(m.toString());
		
		//reference equality
		int i = 10;
		int j = 10;
		if (i == j) 
		{
			System.out.println("both i and j are equal\n");
		}
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
				
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		if (e1 == e2)
			System.out.println("both e1 and e2 are ==\n");
		else 
			System.out.println("both e1 and e2 are not ==\n");
		
		Manager m1 = new Manager();
		Employee e3 = m1;
		
		System.out.println(m1.hashCode());
		System.out.println(e3.hashCode());
		if (m1 == e3)
		{
			System.out.println("both m1 and e3 are ==\n");
		}
		
		System.out.println(m1.hashCode());
		System.out.println(e3.hashCode());
		if (m1 == e3)
		{
			System.out.println("both m1 and e3 are ==\n");
		}
		
		Manager m3 = new Manager();
		Manager m4 = new Manager();
		
		m3.id = 100;
		m4.id = 100;
		if (m3.equals(m4))
			System.out.println("Both m3 and 4 are equal if their ids are equal\n");
			
	}		
	
}
