package com.java.concepts;

import java.io.*;

public class ExceptionsExample {

	public static void main(String[] args) {

			int a = 100;
			int b = 10;
			//Arithmetic Exception
			try {
				FileReader file = new FileReader("EmployeeInfo.txt");
				int c = a/b;
				System.out.println(c);
				String str = null;
				System.out.println(str.length());
				
			}
			
			//Cannot write this child catch block after the parent catch block
			//it will give compilation error when we do that
			catch(NullPointerException e) {
				e.printStackTrace();
			}
			catch(Exception e) {
					e.printStackTrace();
			}
			finally {
				//always executes
				//for example, delete object even if there is an exception
				//for example, close the file handler
				System.out.println("finally");
				FileReader file = null;
				try {
					file.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			} 
						
	}

