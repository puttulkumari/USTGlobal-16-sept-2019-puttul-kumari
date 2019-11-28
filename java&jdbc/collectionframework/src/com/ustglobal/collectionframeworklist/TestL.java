package com.ustglobal.collectionframeworklist;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		
		LinkedList <Integer> l = new LinkedList<>();
		
		l.add(12);
		l.add(52);
		l.add(18);
		l.add(79);
		l.add(10);
		
		System.out.println("before sort" +l);
		Collections.sort(l);
		System.out.println("after sort" +l);
		
		Collections.reverse(l);
		System.out.println("after reverse" +l);
		
		Collections.shuffle(l);
		System.out.println("after shuffle" +l);
	}

}
