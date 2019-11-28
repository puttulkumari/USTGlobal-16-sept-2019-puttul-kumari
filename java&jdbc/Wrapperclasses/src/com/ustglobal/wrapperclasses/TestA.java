package com.ustglobal.wrapperclasses;

public class TestA {
	
	public static void main(String[] args) {
		
		int a=10;
		System.out.println("a is "+a);
		
		Integer i=a;                                        //auto boxing or boxing -primitive to non-primitive
		System.out.println("i is "+i);
		
		
		
		
		Integer x=10;
		Integer z=new Integer(20);
		System.out.println("x is "+x);
		int y=x;                                              //un boxing  -non-primitive to primitive
		System.out.println("y is "+y);
		
		
		
		
		int value= Integer.parseInt("123");
		System.out.println("value is "+value);
		
		
		Boolean result=Boolean.parseBoolean("true");
		System.out.println("result is"+result);
		
		
		int value1= Integer.parseInt("123");
		System.out.println("value is "+value1);
		
		Boolean result1=Boolean.parseBoolean("true");
		System.out.println("result is"+result1);
		
	}

}
