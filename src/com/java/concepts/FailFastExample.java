package com.java.concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> phoneModels = new HashMap<String,String>();
		phoneModels.put("Samsung", "S4");
		phoneModels.put("iPhone","i6");
		phoneModels.put("HTC","next");
		
		Iterator itr = phoneModels.keySet().iterator();
		
		while (itr.hasNext()) 
		{
			/*
			 * How to fix the following 2 statements? I want to print both key and value
			 * Map.Entry<String,String> tempkey = (Map.Entry<String,String>)itr.next();
			 * System.out.println(tempkey.getKey() + " " + tempkey.getValue());
			 */
			System.out.println(itr.next());	
			phoneModels.put("Samsung", "S5"); //This is like an update, right? Why no Exception is thrown?
			//phoneModels.put("Motorola", "A4"); // This displays CME as expected
		}
	}

}

