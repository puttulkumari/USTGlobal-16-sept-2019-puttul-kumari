package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		
		System.out.println("*********int*******");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		for(int nums: num)
		{
			System.out.println(nums);
		}
		System.out.println("********char*******");
		char[] ch= {'a','b','c'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		for (char c:ch) {
			System.out.println(c);
		}
		
		System.out.println("********boolean********");
		boolean[] b = {true,false,true,true};
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("****************");
	
		for (boolean b1:b) {
			System.out.println(b1);
		}
		
		
	
	System.out.println("*********byte*******");
	byte[] c = {1,2,5};
	
	for(int i=0;i<c.length;i++) 
	{
		System.out.println(c[i]);
	}
	for (byte b2:c) {
		System.out.println(b2);
	}
		
	System.out.println("*********double*******");
	double[] d = {1.42,2.87,5.6};
	
	for(int i=0;i<d.length;i++) 
	{
		System.out.println(d[i]);
	}
	
	for (double d1:d) {
		System.out.println(d);
	}
		
		
	}

}
