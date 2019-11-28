package com.ustglobal.objectclass;

public class Employee 
{

	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) 
	{

		if (this == obj) 
		{
			return true;

		}
		return false;
	}
	
}
