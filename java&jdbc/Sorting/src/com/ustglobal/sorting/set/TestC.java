package com.ustglobal.sorting.set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashSet  ls = new LinkedHashSet();
		ls.add("ram");
		ls.add(99.9);
		ls.add("deepa");
		ls.add("krishna");
		ls.add(67);
		ls.add(null);
		ls.add(null);
		
		
		System.out.println("******************for each****************");
		for(Object s : ls)
		{
			System.out.println(s);
		}
		
		System.out.println("******************for iterator****************");
		Iterator it  = ls.iterator();
				while(it.hasNext())
				{
					Object s = it.next();
					System.out.println(s);
				}

	}
}
