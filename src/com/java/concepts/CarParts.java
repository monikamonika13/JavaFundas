package com.java.concepts;

public class CarParts {
	private int id;
	static int factoryID = 123;
	
	public CarParts(int id) {
		this.id = 777;
		System.out.println("Inside CarParts constructor!! CarParts id: " + id);
	}
	public class Wheels {
		public Wheels() {
			System.out.println("Inside Wheels constructor!! Wheels factory ID: " + factoryID);
		}
	}
	
}
