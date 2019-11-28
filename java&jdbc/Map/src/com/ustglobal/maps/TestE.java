package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {

		TreeMap <String,Integer> lh = new TreeMap <String,Integer>();
		lh.put("Patna",880000 );
		lh.put("Hariyana",135864 );
		lh.put("Banglore",56006898 );
		//lh.put("null",880000 );       NullPointerException
		
		
		for(Map.Entry<String,Integer> m :lh.entrySet())
		{
			
			Integer value = m.getValue();
			String key = m.getKey();
			
			System.out.println("key is "+key);
			System.out.println("value is "+value);
			System.out.println("====================");
			
		}
		
	}

}
