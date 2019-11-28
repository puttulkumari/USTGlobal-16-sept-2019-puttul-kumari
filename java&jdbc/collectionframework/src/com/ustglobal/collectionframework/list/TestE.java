package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
public static void main(String[] args) {
	
	
	ArrayList al = new ArrayList();
	al.add("parghya");
	
	Object o = al.get(0);
	String name = (String) o;             //down casting
	
	name = name.toUpperCase();
	System.out.println(name);
}
}
