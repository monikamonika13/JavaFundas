package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MultiDimensionalArray {

	//Example of 1D, 2D, 3D arrays
	public static void arraysExample() {
		//1- dimensional array
		int[] arrS; //declare
		arrS = new int[4]; //initialize
		arrS[0]=10;
		arrS[1]=20;
		arrS[2]=30;
		arrS[3]=40;
		for (int i=0;i<arrS.length;i++)
			System.out.println("1-Dimensional Array element " + i + ": " + arrS[i]);
		
		//2-dimensional arrays
		String[][] arrD = {{"Toyota ", "Hyundai "},
				{"Sedan", "SUV", "Minivan"}};
		
		System.out.println("2-Dimensional array example arrD[0][1]: " + arrD[0][0] + arrD[1][0]);
		System.out.println("2-Dimensional array example arrD[0][2]: " + arrD[0][0] + arrD[1][1]);
		System.out.println("2-Dimensional array example arrD[0][3]: " + arrD[0][0] + arrD[1][2]);
		System.out.println("2-Dimensional array example arrD[1][1]: " + arrD[0][1] + arrD[1][0]);
		System.out.println("2-Dimensional array example arrD[1][2]: " + arrD[0][1] + arrD[1][1]);
		System.out.println("2-Dimensional array example arrD[1][3]: " + arrD[0][1] + arrD[1][2]);
		
		//3 dimensional arrays
		int[][][] arrRGB; //declare
		arrRGB = new int[3][3][3]; //initialize
		Random rand = new Random();
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				for (int k=0;k<3;k++){
					arrRGB[i][j][k] = rand.nextInt(100);
					System.out.println("3-Dimensional Array element " + i + "," + j + "," + k + ": " + arrRGB[i][j][k]);
				}
			}
		}
	}
	
	//Example of anonymous array - array without a name
	public static void anonymousArrayExample(String arr[]) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i].matches("(.*)apple(.*)"))
				System.out.println(arr[i] + ": that\'s some apple!");
		}
		
	}
	
	public static void duplicateWord(String str) {
		//Simple login for split by spaces, will not work correctly for punctuations :- ) 
		String[] arrayOfWords = str.split(" ");
		Map<String,Integer> wordCounts = new HashMap<String, Integer>();
		int count = 0;
		for (int i=0; i<arrayOfWords.length; i++) {
			//System.out.println(arrayOfWords[i] + " " + wordCounts.toString());
			if (wordCounts.containsKey(arrayOfWords[i].toLowerCase())) {
				count = wordCounts.get(arrayOfWords[i].toLowerCase()) + 1;
				wordCounts.replace(arrayOfWords[i].toLowerCase(), count);
			}
			else {
				wordCounts.put(arrayOfWords[i].toLowerCase(), 1);
			}
		}
		System.out.println(wordCounts.toString());
	}
	
	public static void duplicateChars(String str) { 
		char[] arrayOfChars = str.toLowerCase().toCharArray();
		Map<Character,Integer> charCounts = new HashMap<Character, Integer>();
		int count = 0;
		for (int i=0; i<arrayOfChars.length; i++) {
			//System.out.println(arrayOfChars[i] + " " + charCounts.toString());
			if (charCounts.containsKey(arrayOfChars[i])) {
				count = charCounts.get(arrayOfChars[i]) + 1;
				charCounts.replace(arrayOfChars[i], count);
			}
			else {
				charCounts.put(arrayOfChars[i], 1);
			}
		}
		System.out.println(str + " character counts: " + charCounts.toString());
	}

	public static void main(String[] args) {
		arraysExample();
		anonymousArrayExample(new String[] {"apple", "pineapple", "orange", "custard apple"});
		String s1 = "this is a Test program to test IS This something you know!";
		String s2 = "Mary had a little lamb little lamb little lamb";
		duplicateWord(s1);
		duplicateWord(s2);
		duplicateChars("apple");
	}
}
