package com.java.concepts;

import java.util.Scanner;

public class ReverseIntegerNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a Number:");
		int num = sc.nextInt();

		int rev = 0;
		int s;
		
		//If the original number has zero(s) at the end of the number
		//the zero(s) will not be displayed as the reversed number with this logic
		while (num > 0) {
			s = num%10;
			rev = (rev*10)+s;
			num = num/10;
		}

	System.out.println("Reversed number is "+rev);
	}
}	
