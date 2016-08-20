package com.java.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MinMaxArray {

	static void FindingMaxMin (int [] arr)  {
		int max = arr[0];
		int min = arr[0];
		
		for (int i=0; i<arr.length;i++) {
			for (int j=i; j<arr.length;j++) {
				if (min > arr[j])
					min = arr[j];
				
				if (max < arr[j])
					max = arr[j];
			}			                        
		}
		System.out.println("Maximum Number : "+max);
		System.out.println("Minimum Number : "+min);	
	}
		
	public static void main(String[] args) {
		
		//Once logic works, use Scanner to take input from sys.in or file
		int[] myArray = {81,20,3,114,5,90,-78,65};	
		
		
		try {
			Scanner s = new Scanner(new File("Numbers.txt"));
			int i=0;
			while (i<8) {
				myArray[i] = Integer.valueOf(s.nextLine());
				i++;
			}
		}  
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/*catch (EOFException e) {
			e.printStackTrace();
		}*/
				
		FindingMaxMin(myArray);
	}
}
