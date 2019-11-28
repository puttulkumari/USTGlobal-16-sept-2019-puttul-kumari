package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> 
{
	
	
	@Override
	public int compare(Bank o5, Bank o6) {
		
		Long c =o5.micr;
		Long d =o6.micr;
		
		return c.compareTo(d);
	}
	
	
	

}
