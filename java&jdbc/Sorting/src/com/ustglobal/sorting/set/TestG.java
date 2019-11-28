package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {

		HashSet <Employee> hs = new HashSet<Employee>();

		Employee e1 = new Employee(11,"sita",74000);
		Employee e2 = new Employee(13,"ram",25000);
		Employee e3 = new Employee(78,"krishna",35000);
		Employee e4 = new Employee(44,"rita",60000);
		Employee e5 = new Employee(22,"seela",65000);
		Employee e6 = new Employee(22,"seela",65000);
		hs.add(e1);	
		hs.add(e2);	
		hs.add(e3);	
		hs.add(e4);	
		hs.add(e5);	
		hs.add(e6);	

		System.out.println("***************using iterator************");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
		System.out.println("id is -"+e.id);
		System.out.println("name is -"+e.name);

		System.out.println("salary is -"+e.salary);
	}

}
}
