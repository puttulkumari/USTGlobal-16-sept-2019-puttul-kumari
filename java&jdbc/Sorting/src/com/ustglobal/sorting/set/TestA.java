package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		
		
		
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(189);
		hs.add("deepa");
		hs.add(54.9);
		hs.add(null);
		
		
		System.out.println("******************for each****************");
		for(Object o :hs)
		{
			System.out.println(o);
		}
		
		System.out.println("******************for each****************");
		Iterator it  = hs.iterator();
				while(it.hasNext())
				{
					Object s = it.next();
					System.out.println(s);
				}
		
	}

}
