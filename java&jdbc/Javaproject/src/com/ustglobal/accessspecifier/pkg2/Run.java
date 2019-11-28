package com.ustglobal.accessspecifier.pkg2;

public class Run {
	
	public static void main(String[] args) {
		Demo d= new Demo();
		
		//private***********************************************************
	    //System.out.println(d.a);                 //not possible to access outside the class.
	   // d.add();
		
		//Default***********************************************************
		System.out.println(d.b);
		  d.sub();
		  
		  //Protected***********************************************************
		  System.out.println(d.c);
		  d.mul();
		  
		  
		  //public***********************************************************
		  System.out.println(d.name);
		  d.div();
		  
	}

}
