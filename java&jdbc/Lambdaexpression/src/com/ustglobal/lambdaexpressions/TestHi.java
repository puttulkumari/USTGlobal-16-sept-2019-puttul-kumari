package com.ustglobal.lambdaexpressions;

public class TestHi {
	
	public static void main(String[] args) 
	{
		Hi s = ()-> {
		System.out.println("hello");
		return null;
	
		};
		
		String str = s.Hi();
		System.out.println(str);
	}
	

}
