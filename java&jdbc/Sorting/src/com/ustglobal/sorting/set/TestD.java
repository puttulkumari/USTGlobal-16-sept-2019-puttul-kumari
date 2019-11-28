package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		ls.add(566.6);
		ls.add(99.9);
		ls.add(67.5);
		ls.add(8.3);
		
	
		System.out.println("******************for each****************");
		for(Double s : ls)
		{
			System.out.println(s);
		}
		
		System.out.println("******************for iterator****************");
		Iterator <Double>  it= ls.iterator();
				while(it.hasNext())
				{
					Double p = it.next();
					System.out.println(p);
				}

	}
	
}
