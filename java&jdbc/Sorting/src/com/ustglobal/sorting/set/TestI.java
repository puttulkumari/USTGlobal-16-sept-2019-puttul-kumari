package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		//TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		
		SortByPincode sp = new SortByPincode();
		//TreeSet<Bank> ts = new TreeSet<Bank>(sp);
		
		SortByMicr sm = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		
		
		Bank b1 = new Bank("HDFC",560032,793439234);
		Bank b2 = new Bank("SBI",566632,96392349);
		Bank b3 = new Bank("CITI",567324,89234399);
		Bank b4 = new Bank("PNB",454638,34392349);
		Bank b5 = new Bank("PNB",454638,34392349);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("using iterator-----------------------");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext())
		{
			Bank b = it.next();
		
		System.out.println("name is :"+b.name);
		System.out.println("-------------------");
		
		System.out.println("pincode  is :"+b.pincode);
		System.out.println("-------------------");
		System.out.println("micr  is :"+b.micr);
	}
	}

}
