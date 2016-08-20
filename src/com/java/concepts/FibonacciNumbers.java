package com.java.concepts;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number upto which you want to write the Fibonacci Series:");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int fib=0;
		
		System.out.print("Fibonacci Series is: "+a+" "+b);
		for (int i=0;i<=num;i++){
			fib=a+b;
			a=b;
			b=fib;
		System.out.print(" "+fib);
		}

	}

}
