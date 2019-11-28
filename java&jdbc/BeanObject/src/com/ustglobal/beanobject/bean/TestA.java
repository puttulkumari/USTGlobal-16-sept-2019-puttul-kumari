package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setId(12);
		s.setName("sita");
		s.setRollno(123);
		
		Database db=new Database();
		db.recieve(s);
		
		
		
		Employee e=new Employee();
		e.setId(12);
		e.setName("sita");
		e.setDesignation("developer");
		e.setDept("computers");
		e.setSalary(40000);
		
		
		db.details(e);
		
	}

}
