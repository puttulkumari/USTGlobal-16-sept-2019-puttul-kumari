package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
	
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		
		al.add(new Marker(50,"blue"));
		al.add(new Marker(40,"black"));
		al.add(new Marker(60,"green"));
		al.add(new Marker(30,"red"));
		System.out.println("before sorting");
		display(al);
 
		SortByPrice sb = new SortByPrice();
		//Collections.sort(al,sb);
		SortByColor sc = new SortByColor();
		Collections.sort(al,sc);
		
		
		System.out.println("after sorting-----------------");
		display(al);	

	}
	
	static void display(ArrayList<Marker> a)
	{
		Iterator<Marker> it = a.iterator();
		while(it.hasNext())
		{
			Marker m= it.next();
			System.out.println("Barand is "+m.color);
			System.out.println("Price is "+m.price);
			
		}
	}

}
