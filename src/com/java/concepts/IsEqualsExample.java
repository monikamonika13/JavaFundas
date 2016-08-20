package com.java.concepts;

public class IsEqualsExample {

	public static void main(String[] args) {
		
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		
		if (s1 == s2)
			System.out.println("s1 == s2 is TRUE when s1 and s2 are two different objects");
		else 
			System.out.println("s1 == s2 is FALSE when s1 and s2 are two different objects");//expected
		
		
		if (s1.equals(s2))
			System.out.println("s1 iequals s2 is TRUE even when s1 and s2 are two different objects with same values");//expected
		else 
			System.out.println("s1 isequals s2 is FALSE when s1 and s2 are two different objects with same values");
			
	}
	
	
}
