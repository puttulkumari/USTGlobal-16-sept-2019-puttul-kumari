package com.ustglobal.exception.first;

public class TestB 
{
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		int a = 10;           //declaration is important.
		int b = 0;
		
		try {
			b = 10/0;
			
			System.out.println(b);
			System.out.println("hello");           //it will not executed
			System.out.println("happy diwali");   //it will not executed
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("number is divided by zero");
		}
		
		System.out.println("main ended");
	}

}
