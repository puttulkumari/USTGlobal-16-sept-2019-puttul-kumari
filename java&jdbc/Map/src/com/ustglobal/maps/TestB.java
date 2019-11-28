package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {



		HashMap hm = new HashMap();

		hm.put("kuku",832488);
		hm.put("mala",788834);
		hm.put("sweta",6353488);
		hm.put("jaya",828882);


		HashMap hm1 = new HashMap();

		hm1.put("pyari",567886);
		hm1.put("mate",777777);
		hm1.put("aishwarya",666666);
		hm1.put("niki",888888);
		System.out.println("data is: "+hm);

		boolean hashKey = hm.containsKey("mala");

		System.out.println("has key is: "+hashKey);

		boolean hasValue = hm.containsValue(828882);

		System.out.println("has key is: "+hasValue);
		
		
		System.out.println("************************");
		hm.putAll(hm1);
		System.out.println("after put all"+hm);     //copy all data both map
		
		
		System.out.println(hm.size());    //chk size
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("map is empty   "+isEmpty);
		
		hm.clear();
		System.out.println("after clear "+hm);
		


	}

}
