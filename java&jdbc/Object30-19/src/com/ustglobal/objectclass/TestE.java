package com.ustglobal.objectclass;


public class TestE {
	public static void main(String[] args) {
		
		
		
		Car c1=new Car(200000,"audi","white");
		int h1=c1.hashCode();
		System.out.println(h1);
		System.out.println(c1);
		
		Car c2=new Car(1500000,"bmw","black");
		int h2=c2.hashCode();
		System.out.println(h2);
		System.out.println(c2);
		
		Car c3=new Car(30000000,"farari","red");
		int h3=c3.hashCode();
		System.out.println(h3);
		System.out.println(c3);
		
		
	}

}
