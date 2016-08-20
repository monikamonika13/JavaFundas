package com.java.concepts;

public class LargestInt {

	public static void main(String[] args) {
		
		//int[] arr = {100, 243, 6, 14, -1};
		//int[] arr = {10, 23, 126, 1403, -900};
		int[] arr = {10, 0, -60, 3, -9};
		int largest = arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}

