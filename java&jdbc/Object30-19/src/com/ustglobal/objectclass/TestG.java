package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"ram",20000);
		Employee e2=new Employee(2,"ramesh",35000);
		Employee e3=new Employee(3,"ramanuj",50000);
		
		boolean isEqual = e1.equals(e2);
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e2));
		System.out.println("**********************");
		System.out.println(e2.equals(e1));
		System.out.println(e2.equals(e3));
		System.out.println("**********************");
		System.out.println(e3.equals(e2));
		System.out.println(e3.equals(e1));
		
	}

}
