package com.java.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Synchronized {
	
	public static void main(String[] args) {
	
		//synchronized Arraylist
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(11);
		alist.add(23);
		alist.add(459);
		
		List list = Collections.synchronizedList(alist); 
		synchronized(list) {
			Iterator i = list.iterator();
			while (i.hasNext())
			{
				System.out.println(i.next());
				//alist.add(900);//expected CME on synchronizedList
			}
		}
			
		System.out.println("-------------------------------");
		//synchronized hashmap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
        hmap.put(1, "Book1");
        hmap.put(3, "Book3");
        hmap.put(4, "Book4");
        hmap.put(2, "Book2");
        hmap.put(5, "Book5");
        
        Map map= Collections.synchronizedMap(hmap);
        Set set = map.entrySet();       
        synchronized(map) {
        	Iterator i = set.iterator();
        	while (i.hasNext()) {
        		Map.Entry tempkey = (Map.Entry)i.next();
        		System.out.println(tempkey.getValue()); 
        		hmap.put(6, "Book6"); //expected CME
        	}
        }
        
	}
}


