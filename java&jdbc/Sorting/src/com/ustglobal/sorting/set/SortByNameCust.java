package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByNameCust implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		String a =o1.name;
		String b =o2.name;
		return a.compareTo(b);
	}

}
