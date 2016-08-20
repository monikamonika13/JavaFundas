package com.java.concepts;

public class Manager extends Employee {
	
	public String department;
	
	@Override
	public String getDetails() {
		return id + ":" + name + ":" + salary + ":" + department;
	}
}

