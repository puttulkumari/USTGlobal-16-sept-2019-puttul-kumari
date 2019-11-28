package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;


public class TestE {

	public static void main(String[] args) {
		TreeSet  ts = new TreeSet();
		ts.add(123);
		ts.add(77);
		ts.add(34);
		
		
		
		System.out.println("------------------for each------------------------");
		for(Object s : ts)
		{
			System.out.println(s);
		}
		
		System.out.println("-------------------for iterator----------------------");
		Iterator it  = ts.iterator();
				while(it.hasNext())
				{
					Object s = it.next();
					System.out.println(s);
				}

	}

}
