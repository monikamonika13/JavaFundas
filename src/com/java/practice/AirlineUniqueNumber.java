package com.java.practice;

public class AirlineUniqueNumber {

	public String airlineName; //eg. "SOUTHWEST" or "AIR CANADA"
	public int airlineNum; //eg. 1275 or 23
	
	public AirlineUniqueNumber(String airlineName, int airlineNum) {
		this.airlineName = airlineName;
		this.airlineNum = airlineNum;
	}
	
	@Override
	public int hashCode() {
		return airlineName.length();
	}
	
	@Override
	public boolean equals(Object o) {
		if (((AirlineUniqueNumber)o).toString().equals(this.toString()))
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return airlineName+airlineNum;
		
	}
	
}
