package com.java.practice;

import java.util.ArrayList;

public class RemoveDuplicatesFromList {
	
//Removing duplicates from the list
public static void ListDuplicates() {
	ArrayList<String> list = new ArrayList<String>();
	list.add("apples");
	list.add("mangoes");
	list.add("oranges");
	list.add("apples");
	list.add("grapes");
for (int i=0; i<list.size(); i++)	{
	for (int j=i+1; j<list.size(); j++) {
			if (list.get(i).equals(list.get(j))) {
				System.out.println(list.get(i) + " is duplicate at index " + i);
				list.remove(j);
				j--;
			}
	}
}
System.out.println("-- List after removing the duplicate--");
for (String s : list) {
	System.out.println(" " + s);
}
}

public static void main(String args[]) {
	ListDuplicates();
}

}
