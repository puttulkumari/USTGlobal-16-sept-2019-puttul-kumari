package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String>  ts = new TreeSet<>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sheela");
		ts.add("tina");
		ts.add("rita");
		
		
		System.out.println("----------for each-----------");
		for(String s : ts)
		{
			System.out.println(s);
		}
		
		System.out.println("----------for iterator---------");
		Iterator <String>it  = ts.iterator();
				while(it.hasNext())
				{
					String s = it.next();
					System.out.println(s);
				}
	}

}
