package com.ustglobal.google;

public class TestB 
{
	public static void main(String[] args) {
		
		Browser b=new Browser();
		
		Google g=new Gmail();                 //upcasting
		b.open(g);
		
		Google gd=new GoogleDrive();
		b.open(gd);
		
		
	}
	

}
