package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank>
{

	@Override
	public int compare(Bank o3, Bank o4) {
		
		Integer a =o3.pincode;
		Integer b =o4.pincode;
		
		return a.compareTo(b);
	}

}
