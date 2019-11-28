package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		
		HashSet <String> hs = new HashSet<String>();
		hs.add("ram");
		hs.add("sita");
		hs.add("deepa");
		hs.add("krishna");
		hs.add("radha");
		
		
		System.out.println("******************for each****************");
		for(String s :hs)
		{
			System.out.println(s);
		}
		
		System.out.println("******************for each****************");
		Iterator<String> it  = hs.iterator();
				while(it.hasNext())
				{
					String s = it.next();
					System.out.println(s);
				}

	}

}
