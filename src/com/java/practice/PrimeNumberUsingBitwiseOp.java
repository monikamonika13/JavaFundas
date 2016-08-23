package com.java.practice;

public class PrimeNumberUsingBitwiseOp {

	//check if number is odd or even using BITWISE operator
	public static void bitwiseOddOrEven(int number) {
		if ((number&1) == 0)
			System.out.println(number + " is even!");
		else 
			System.out.println(number + " is odd!");		
	}
	
	public static void main(String args[]) {
		bitwiseOddOrEven(2); //0010
		bitwiseOddOrEven(3); //0011
		bitwiseOddOrEven(4); //0100
		bitwiseOddOrEven(10);
		
	}
}
