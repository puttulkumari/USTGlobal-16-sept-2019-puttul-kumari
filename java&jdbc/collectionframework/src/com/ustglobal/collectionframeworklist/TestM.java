package com.ustglobal.collectionframeworklist;

import java.util.ArrayList;
import java.util.Collections;


public class TestM {
	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<>();
		
		al.add("sita");
		al.add("ram");
		al.add("rahul");
		al.add("jai");
		al.add("rita");
		
		
		System.out.println("before sort" +al);
		Collections.sort(al);
		System.out.println("after sort" +al);
		
		Collections.reverse(al);
		System.out.println("after reverse" +al);
		
		Collections.shuffle(al);
		System.out.println("after shuffle" +al);
	}


}
