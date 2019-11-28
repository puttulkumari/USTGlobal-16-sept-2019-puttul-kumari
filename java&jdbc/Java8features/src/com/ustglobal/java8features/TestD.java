package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestD {
	public static void main(String[] args) {
		
		Predicate<Employee> p = s->
		{
			if(s.id>=37) {
				return true;
				
			}
			else {
				return false;	
			     }	
		};
		
		
		Employee e = new Employee(1,"rita",50000);
		boolean res = p.test(e);
		System.out.println("result "+res);
	}

}
