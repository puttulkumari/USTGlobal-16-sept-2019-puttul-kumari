package com.ustglobal.singleton;

public class Test {
	public static void main(String[] args) {
		
		Singlton ms = Singlton.getDBConnection();
		ms.s="hello";
		System.out.println("hash code of ms "+ms.hashCode());
		Singlton mx = Singlton.getDBConnection();
		mx.s="bye";
		System.out.println("hash code of mx "+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}

}
