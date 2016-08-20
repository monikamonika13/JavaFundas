package com.java.concepts;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropExample {

	static void loadProperties() throws IOException 
	{
		FileReader file = new FileReader("config.properties");
		Properties prop = new Properties();
		prop.load(file);
		System.out.println("userName: "+prop.getProperty("userName"));
		System.out.println("password: "+prop.getProperty("pwd"));
		
		System.out.println("\nPrint elements using iterator:");
		Iterator itr = (Iterator) prop.elements();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nPrint elements using enumerator:");
		Enumeration e = prop.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	
	static void localeprops() 
	{
		ResourceBundle bundle = ResourceBundle.getBundle("com.util.config_it",Locale.ITALIAN);
		System.out.println(Locale.ITALIAN+ "---" + bundle.getString("message.hello"));
		
		Locale.setDefault(new Locale("in","ID"));
		bundle = ResourceBundle.getBundle("config_it");
		System.out.println(Locale.getDefault()+"---" + bundle.getString("message.hello"));
	}
	
	static void dateEx() 
	{
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(d);
		System.out.println(f.format(d));
		
		System.out.println(System.currentTimeMillis());
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//PropExample.loadProperties();
		//PropExample.localeprops();
		PropExample.dateEx();
	}

}
