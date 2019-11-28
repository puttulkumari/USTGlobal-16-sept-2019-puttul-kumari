package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		
		hm.put("kuku",832488);
		hm.put("mala",788834);
		hm.put("sweta",6353488);
		hm.put("jaya",828882);
		//hm.put(null,894356);    //old value replace by new null value
		hm.put(null,787656);
		
		//hm.put("jaya",null);
		
		//hm.put(null,null);
		System.out.println("data after modify add null is: "+hm);
		
		
		System.out.println("data is: "+hm);
		hm.put("mala",988834);
		System.out.println("data after modify change value is: "+hm);
		
		hm.put("sahi",988834);
		System.out.println("data after modify change key is: "+hm);
		System.out.println("******************************************");
		
		Object phoneno = hm.get("jaya");
		System.out.println("get key  if present "+phoneno);
		
		Object phoneno1 = hm.get("jay");
		System.out.println("get key  if present "+phoneno1);
		
		System.out.println("*******************remove***********************");
		Object value = hm.remove("kuku");
		System.out.println("remove key  if present "+value);
		
		System.out.println("data is: "+hm);
	}

}
