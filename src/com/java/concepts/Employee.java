package com.java.concepts;

public class Employee {
	
	protected int id;
	public String name;
	public double salary;
	public String jobTitle;
	
	public String getDetails() {
		return id + ":" + name + ":" + salary;
	}
	
	@Override
	public boolean equals(Object o){
		
		if (o instanceof Employee)
		{
			Employee e = (Employee)o;
			if(this.id == e.id)
				{
				return true;
				}
		}
		return false;
	}
	
	public void setName(String nameIn) {
		name = nameIn;
	}
	
	public void setJobTitle(String jobTitleIn) {
		jobTitle = jobTitleIn;
	}

	public void setpayCheck(Double payCheckIn) {
		salary = payCheckIn;
	}
	
	public void displayCheck(Object o){
		Employee e = (Employee)o;
		System.out.println(e.name +" "+e.jobTitle+" "+e.salary);
	}
}

