package com.java.concepts;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(new File("EmployeeInfo.txt"));
		
		for (int empNum=1; empNum<=3; empNum++){
			payOneEmployee(s);
		}
	}
	
	static void payOneEmployee(Scanner a){
		Employee emp = new Employee();
		
		emp.setName(a.nextLine());
		emp.setJobTitle(a.nextLine());
		emp.setpayCheck(a.nextDouble());
		//nextDouble() does not move to the next line
		//so add explicit nextLine() and add an extra blank line to EmployeeInfo.txt before EOF
		a.nextLine(); 
		emp.displayCheck(emp);
	}
}

