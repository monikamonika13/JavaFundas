package com.java.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.java.concepts.TVSizeComparator;

public class HDTV implements Comparable<HDTV> {

	private int size;
	private String brand;
	
	public HDTV (int size, String brand) {
		this.size = size;
		this.brand=brand;		
	}
	
	public int getSize() {
		return size;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public int compareTo(HDTV tv){
		if (this.getSize() > tv.getSize())
			return 1;
		else if (this.getSize() < tv.getSize())
			return -1;
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60,"LG");
		HDTV tv3 = new HDTV(48,"Visio");
		
		ArrayList<HDTV> list = new ArrayList<HDTV>();
		list.add(tv1);
		list.add(tv2);
		list.add(tv3);
		
		//Using comparable
		Collections.sort(list);
		//Using Collections.max function after sort
		System.out.println(Collections.max(list).getBrand() + " is bigger size");
		//Using comparable
		if ((tv1.compareTo(tv2) > 0) && (tv1.compareTo(tv3) > 0))
			System.out.println(tv1.getBrand() + " is bigger size.");
		else if ((tv2.compareTo(tv1) > 0) && (tv2.compareTo(tv3) > 0))
			System.out.println(tv2.getBrand() + " is bigger size.");	
			else 
				System.out.println(tv3.getBrand() + " is bigger size.");
			
		//Using Comparator - reverse order
		Collections.sort(list, new TVSizeComparator());
		for (HDTV h : list)
			System.out.println(h.getBrand() + " " + h.getSize());
	}

}


