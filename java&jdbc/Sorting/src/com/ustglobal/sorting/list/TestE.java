package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Pen> l = new ArrayList<Pen>();
		
		Pen p1 = new Pen(20,"renolds");
		Pen p2 = new Pen(50,"cello");
		Pen p3 = new Pen(100,"writometer");
		Pen p4 = new Pen(20,"xyz");
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		System.out.println("before sorting");
		displayPenDetails(l);
		Collections.sort(l);
		
		System.out.println("after sorting");
		displayPenDetails(l);
	}
		
		 static void displayPenDetails(ArrayList<Pen> al)
		{
			Iterator<Pen> it = al.iterator();
			while(it.hasNext())
			{
				Pen p = it.next();
				System.out.println("Barand is "+p.brand);
				System.out.println("Price is "+p.price);
				
			}
	}
}

	
