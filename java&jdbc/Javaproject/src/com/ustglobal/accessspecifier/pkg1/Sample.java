package com.ustglobal.accessspecifier.pkg1;

import com.ustglobal.accessspecifier.pkg2.Demo;

public class Sample  extends Demo
{
	
	
	public static void main(String[] args) {
		
	
	
	
	Demo d= new Demo();
	
	//private***********************************************************
    //System.out.println(d.a);                 //not possible to access outside the class.
   // d.add();
	
	//Default***********************************************************
	
	//System.out.println(d.b);
	//  d.sub();
	  
	  Sample s=new Sample();
	  
	  //Protected***********************************************************
	  System.out.println(s.c);
	  s.mul();
	  
	  
	  //public***********************************************************
	  System.out.println(d.name);
	  d.div();
	  
	}
}
