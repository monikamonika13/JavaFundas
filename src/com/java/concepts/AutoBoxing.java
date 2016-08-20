package com.java.concepts;

public class AutoBoxing {

	public static void main(String[] args) {
		
		String number = "101032";
		int c = Integer.parseInt(number);
		
		System.out.println(c);
		
		int i = 10;
		int[] myArray = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.print("\nArray original contents are: ");
		for (int j=0;j<myArray.length;j++)
			System.out.print(myArray[j]+" ");
		
		//Integer is a wrapper class
		//written in PASCAL case
		//the data is moved from heap to heap 
		Integer myInt = new Integer(i);
		myArray[0] = myInt.intValue();
		
		System.out.print("\nArray contents after making myArray[0] as 10 are: ");
		for (int j=0;j<myArray.length;j++)
			System.out.print(myArray[j]+" ");
	}

}


