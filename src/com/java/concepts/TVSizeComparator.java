package com.java.concepts;

import java.util.Comparator;

public class TVSizeComparator implements Comparator<HDTV> {
	@Override
	//compare but reverse-descending order of size
	public int compare(HDTV o1, HDTV o2) {
		// TODO Auto-generated method stub		
		if (o1.getSize() > o2.getSize())
			return -1;
		else if (o1.getSize() < o2.getSize())
			return 1;
		else 
			return 0;
	}

}
