package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList al  = new ArrayList();
		al.add(100);
		al.add(12.9);
		al.add(true);
		al.add("china");
	
		
		for(Object o :al)
		{
			System.out.println(o);
		}
		
	}

}
