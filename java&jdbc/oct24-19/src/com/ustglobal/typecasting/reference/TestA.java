package com.ustglobal.typecasting.reference;

public class TestA 
{
	public static void main(String[] args) 
	
	
	{
		
		Pen p1=new Marker();                                   //up casting********************************************
		System.out.println("cost of pen"+p1.cost);
		
		p1.write();
		System.out.println("*******************");
		
		//System.out.println("cost of marker"+p1.size);         //not possible
		//p1.color();                                           //not possible
		
		
		
		
		
		Marker m=(Marker) p1;                                     //Down casting****************************************
		System.out.println("cost of marker"+m.size);
		m.color();
		m.write();
		
	}

}
