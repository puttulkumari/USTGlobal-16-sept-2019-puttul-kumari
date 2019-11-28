package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(56);
		pq.add(78);
		pq.offer(1);
		
		System.out.println("before poll "+pq);
		System.out.println("---------------using iterator-------------------");
		
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
		System.out.println(pq.poll());
		
		System.out.println("-------------------");
		
	}
		System.out.println("after poll"+pq);


	}
}
