package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) 
	{
		System.out.println("scanner class");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("age is "+age);
		System.out.println("------------------------------------");
		
		System.out.println("your adress");
		String b=sc.next();
		System.out.println(b);
		System.out.println("------------------------------------");
		
		//System.out.println("write");        
		//String a=sc.nextLine();
		//System.out.println(a);
		//System.out.println("------------------------------------");
		
		
		
		
		
	}

}
