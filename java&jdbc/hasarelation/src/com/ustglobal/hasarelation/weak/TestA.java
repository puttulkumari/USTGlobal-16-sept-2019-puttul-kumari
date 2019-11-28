package com.ustglobal.hasarelation.weak;

public class TestA {
	
	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println("name is:"+p.name);
		p.sleep();
		p.eat();
		System.out.println("**************");
		p.m.write();                                      //has-a- relation
		System.out.println("name is:"+p.m.name);
	}

}
