package com.ustglobal.objectclass;

public class Cow {
	
	int id;
	String name;
	double cost;
	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public boolean equals (Object obj)
	{
		if (this==obj) {
			return true;
			
		}
		return false;
	}
}

