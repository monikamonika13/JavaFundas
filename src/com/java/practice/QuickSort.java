package com.java.practice;


//Quick Sort uses the middle variable as a pivot
//Move numbers smaller than pivot to one side and larger than pivot to the other side
//Do this recursively

public class QuickSort {

	private int array[];
	private int length;
	
	
	public void sort(int[] inputarray) {
		this.array = inputarray;
		length = inputarray.length;
		
		recQuicksort(0, length-1);		
		
	}

	private void recQuicksort(int lowerindex, int higherindex) {
		int i = lowerindex;
		int j = higherindex;
		//calculate pivot as middle number
		//for array of 0-9, pivot is array[0+(10-0)/2]
		//for array of 5-9, pivot is array[5+(9-5)/2]
		int pivot = array[lowerindex+((higherindex-lowerindex)/2)];

		/*
		find a number on the left of the pivot that is larger than the pivot.
		find a number on the right of the pivot that is smaller than the pivot.
		exchange these numbers. now call quicksort recursively until j = lowerindex and i = higherindex
		at which point, we know all the numbers are sorted	
		*/
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swapNumbersAt(i, j);
				i++;
				j--;
			}
		}
		
			if (lowerindex < j)
				recQuicksort(lowerindex, j);
			if (i < higherindex)
				recQuicksort(i, higherindex);
	}

	public void swapNumbersAt(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputarray = {100,3,45,60,5,10};
		QuickSort q = new QuickSort();
		q.sort(inputarray);
		for (int a: inputarray) 
			System.out.print(a + " ");
	}

}
