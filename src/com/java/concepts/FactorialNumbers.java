package com.java.concepts;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a Number upto which you want to get the Factorial:");
		int num = sc.nextInt();
		int fact = 1;
			
		for (int i=1;i<=num;i++) {
			fact = fact*i;
		}

			System.out.println("The Factorial is "+fact);
		
	}
}
