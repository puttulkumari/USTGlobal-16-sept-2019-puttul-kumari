package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		
		SortByNameCust sn = new SortByNameCust();
		TreeSet<Customer> ts = new TreeSet<Customer>(sn);
		
		Customer c1 = new Customer("rita",3,50000);
		Customer c2 = new Customer("ram",1,55000);
		Customer c3 = new Customer("sna",7,35000);
		Customer c4 = new Customer("fatima",8,22000);
		Customer c5 = new Customer("aditya",6,65000);
		
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		
		System.out.println("using iterator-----------------------");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext())
		{
			Customer c = it.next();
		
		System.out.println("name is :"+c.name);
		System.out.println("-------------------");
		
		System.out.println("id  is :"+c.id);
		System.out.println("-------------------");
		System.out.println("salary is :"+c.salary);
	}

	}
}
