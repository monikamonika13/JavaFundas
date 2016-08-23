package com.java.practice;

public class StringBasics {

	public static void main(String args[]) {
		String s = "Java";
		String s1 = new String("Java");
		if (s == s1)
			System.out.println("s == s1");
		else if (s.equals(s1)) 
			System.out.println("s.equals(s1)");
		
		String s2 = "Java";
		if (s == s2)
			System.out.println("s == s2");
		else if (s.equals(s2)) 
			System.out.println("s.equals(s2)");
	}

}
