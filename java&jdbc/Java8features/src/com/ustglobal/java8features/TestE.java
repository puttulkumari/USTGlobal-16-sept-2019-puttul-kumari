package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestE {
	public static void main(String[] args) {
		
		Predicate<Teacher> p = t->
		{
			if(t.id>=37) {
				return true;
				
			}
			else {
				return false;	
			     }	
		};
		
		
		Teacher t = new Teacher("english",1);
		boolean res = p.test(t);
		System.out.println("result "+res);
	}

}
