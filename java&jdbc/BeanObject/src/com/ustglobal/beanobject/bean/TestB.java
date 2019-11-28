package com.ustglobal.beanobject.bean;

public class TestB {
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setId(12);
		e.setName("sita");
		e.setDesignation("developer");
		e.setDept("computers");
		e.setSalary(40000);
		
		Database2 db=new Database2();
		db.recieve(e);
	}


}
