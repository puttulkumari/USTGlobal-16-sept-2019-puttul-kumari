package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

import java.util.Iterator;

public class TestC {
	
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(12.9);
		al.add(true);
		al.add("good morning");
		
		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1 "+o1);
		
		System.out.println("***************");
	
		
		Object o4 = it.next();
		boolean b = it.hasNext();
		System.out.println("has next "+b);
		
		
		System.out.println("====================using for loop===========");
		
		for(int i=0;i<al.size();i++)
		{
			Object obj = al.get(i);
		
		     System.out.println(obj);
		}
		
		
		System.out.println("====================using itrator==========");
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(12.95);
		al1.add(true);
		al1.add("praghya");
		
		Iterator it1 =al1.iterator();
		while(it1.hasNext())
		{
			Object o = it1.next();
			System.out.println(o);
		}
		
		//you can use for loop
		
		
	}

}
