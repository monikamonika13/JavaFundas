package com.java.practice;

import java.util.HashMap;
import java.util.Map;

//Uses class AirlineUniqueNumber as key for the Map
public class HashMapWithCustomKey {

	static Map<AirlineUniqueNumber, String> map = new HashMap<AirlineUniqueNumber, String>();
	
	public static void doCustomMapStuff() {
		AirlineUniqueNumber auS = new AirlineUniqueNumber("SOUTHWEST",1278);
		AirlineUniqueNumber auA = new AirlineUniqueNumber("DELTA",34);
		
		map.put(auS, "Seatle to Oakland - ON TIME");
		map.put(auA, "Alaska to Denver - DELAYED");
		
		for (AirlineUniqueNumber s: map.keySet()) {
			System.out.println("Flight:: " + s.toString() + "- " + map.get(s));
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doCustomMapStuff();

	}

}
