package com.java.concepts;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConcurrentHashMap
		ConcurrentHashMap<String,String> phoneModels1 = new ConcurrentHashMap<String,String>();
		phoneModels1.put("S4", "Samsung");
		phoneModels1.put("i6","iPhone");
		phoneModels1.put("next","HTC");
		
		Iterator itr = phoneModels1.keySet().iterator();
		
		while (itr.hasNext()) 
		{
			System.out.println(phoneModels1.get(itr.next()));
			//If I understand correctly, iterator works on the copy? 
			//And the put method is adding/updating into the original list?
			//Then why are the following 2 values displayed?
			phoneModels1.put("S5", "AnotherSamsung"); 
			phoneModels1.put("A4", "Motorola");
		}
		
		System.out.println("-------------------");
		
		//CopyOnWriteArrayList
		CopyOnWriteArrayList<String> phoneModels2 = new CopyOnWriteArrayList<String>();
		
		phoneModels2.add("Samsung S4");
		phoneModels2.add("iPhone i6");
		phoneModels2.add("HTC next");
		
		Iterator itrA = phoneModels2.iterator();
		
		while (itrA.hasNext())
		{
			System.out.println(itrA.next());
			phoneModels2.add("Samsung S5");//not displayed
			phoneModels2.add("Nokia");//not displayed
		}
		
	}		
	
}

