package com.java.concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		
		//HashMap entry of country names and capitals
		//Use a Set to get the keys from HashMap for iteration purposes
		//Now iterate the set and print the values of the HashMap
		
		Map<String, String> cmap = new HashMap<String, String>();
		
		cmap.put("USA","Washington DC");
		cmap.put("India","New Delhi");
		cmap.put("Sri Lanka","Colombo");
		cmap.put("France","Paris");
		
		Set<String> countrynames = cmap.keySet();
		Iterator<String> itr = countrynames.iterator();
		
		String c; //to store countrynames from itr.next() in the loop 
		System.out.println("Country Name : Capitals");
		System.out.println("-----------------------");
		while (itr.hasNext())
		{
			c = itr.next();
			System.out.println(c + "  :  " + cmap.get(c));
		}
		
		//Just printing the entry set
		System.out.println(cmap.entrySet());
		
		//Print all country names
		System.out.println(cmap.keySet());
		
		//Print capital of country India - value matching a key
		System.out.println(cmap.get("India"));
		
		//Check if the Hashmap contain a key
		System.out.println(cmap.containsKey("USA"));
				
		//Check if the Hashmap contain a value
		System.out.println(cmap.containsValue("Moscow"));
		
	}

}

