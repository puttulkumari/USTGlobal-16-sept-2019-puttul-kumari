package com.ustglobal.lambdaexpressions;

public class TestGreet {
	
	
	public static void main(String[] args) {
		
		
		Greet g = (message)->
		{
			System.out.println("hello");
			
			return message;
			
		};
		
		String s =g.greet("user welcome");
		System.out.println(s);
		
		
	}
	}
