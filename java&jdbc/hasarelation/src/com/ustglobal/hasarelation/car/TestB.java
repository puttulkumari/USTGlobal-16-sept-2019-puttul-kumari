package com.ustglobal.hasarelation.car;


public class TestB {
	
public static void main(String[] args) {
		
		Car c =new Car();
		System.out.println("name is:"+c.name);
		
		c.move();                                      //has-a- relation
		System.out.println("name is:"+c.m.name);
		c.m.loud();
	}


}
