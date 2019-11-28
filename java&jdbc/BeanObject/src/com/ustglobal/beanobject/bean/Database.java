package com.ustglobal.beanobject.bean;

public class Database 
{
	void recieve(Student s)
	{
		System.out.println("id is "+s.getId());
		System.out.println("name is "+s.getName());
		System.out.println("roll no. is "+s.getRollno());
		System.out.println("-------------------------------------");
	}
	
	
	void details(Employee e)
	{
		System.out.println("id is "+e.getId());
		System.out.println("name is "+e.getName());
		System.out.println("salary is "+e.getSalary());
		System.out.println("dep is "+e.getDept());
		System.out.println("designation is "+e.getDesignation());
		
		System.out.println("-------------------------------------");
	}

}
