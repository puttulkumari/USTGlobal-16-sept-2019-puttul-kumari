package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) 
	{
		
		
		Predicate<Student> p = s->
		{
			if(s.marks>=37) {
				return true;
				
			}
			else {
				return false;
				
			}	
		};
		Student s = new Student(1,"anu",65.98);
	
		boolean res = p.test(s);
		System.out.println("result"+res);
		
		
		
	}

}
