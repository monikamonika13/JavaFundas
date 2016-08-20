package com.java.concepts;

import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Exception;


//An example for throw.. catch exceptions for user inputs
public class CountingBoxes {

	public static void main(String[] args) {
		//final below means the value cannot be changed. it is final
		final double boxPrice = 3.25;
		boolean gotGoodInput = false;
		Scanner keyboard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		do {
			System.out.print("How many boxes do we have? : ");
			String numBoxesIn = keyboard.next(); //Remember all keyboard inputs are String
			try {
				int numBoxes = Integer.parseInt(numBoxesIn);
				if (numBoxes < 0 | numBoxes > 100)
					throw new Exception();
				
				System.out.print("The value of all the boxes is ");
				System.out.println(currency.format(numBoxes * boxPrice));
				gotGoodInput = true;				
			}
			catch (NumberFormatException e){
				System.out.println("That's not a number.");
				System.out.println();
			}
			catch (Exception e) {
				System.out.println("That's not possible. Enter a number between 0 to 100.");
				System.out.println();
			}
		}
		while (!gotGoodInput) ;
	}
}

