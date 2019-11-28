package com.ustglobal.typecasting.primitive;

public class TestA 
{
	public static void main(String[] args) 
	{
		byte a=10;
		int b=a;      //implicitly casting
		System.out.println("b is "+b);
		
		  char s='a';
		    int t=s;
		    System.out.println("t is "+t);
		
		
		int p=20;
		double q=p;
		System.out.println("q is "+q);
		System.out.println("----------------");
		
		
		
	    double x=20.53;                  //explicit cast
	    int y=(int)x;
	    System.out.println("y is "+y);
	    byte z=(byte) x;
	    System.out.println("z is "+z);
	    char c=(char) x;
	    System.out.println("c is "+c);
	    System.out.println("----------------");
	    
	 
	    
	    
		
	}

}
