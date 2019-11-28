package com.ustglobal.collectionframeworklist;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	public static void main(String[] args) {
		
		
		
		ArrayList<Double> al = new ArrayList<>();
		al.add(20.6);
		al.add(40.6);
		al.add(50.6);
		al.add(60.6);
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		
		al.add(3, 6600.6);
		System.out.println("after index 3rd: "+al);
		
		al.remove(0);
		System.out.println("after reomove 0th index: "+al);
		
		al.remove(null);
		System.out.println("after reomove null: "+al);
		
		Double val = al.get(4);
		System.out.println("object at 4th index"+val);
		
		al.set(2,77.8);
		System.out.println("after repalce 2nd index: "+al);
		
		al.clear();
		System.out.println("after clear method" +al);
		
		al.contains(54.6);
		
		System.out.println("***************************************");
		
		List<Double> al1 = new ArrayList<>();
		al1.add(20.6);
		al1.add(40.6);
		al1.add(50.6);
		al1.add(60.6);
		al1.add(null);
		al1.add(null);
		al.addAll(al1);
		System.out.println("after add all"+al);
		
		boolean contains = al.containsAll(al1);
		System.out.println("contains all of al1 "+contains);
		System.out.println("before remove"+al);
		
		boolean res = al.removeAll(al1);
		System.out.println("remove all of al1 "+res);
		System.out.println("after remove"+al);
		
		
		
		
	}

}
