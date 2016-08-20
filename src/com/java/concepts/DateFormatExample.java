package com.java.concepts;

public class DateFormatExample {
	
	//Date to String
	//Getting a new format - helps in Localization
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Just for example, Integer to String and vice-versa
		String s = "100";
		int i = Integer.parseInt("24");
		//int j = Integer.parseInt("abc"); Runtime NumberFormatException
		int k = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(k);
		s = String.valueOf(76348);
		System.out.println(s);
		
		
		//Now Date
		
	}

}
