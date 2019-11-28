package com.ustglobal.maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class TestG 
	{
		public static void main(String[] args) 
		{
			Employee e1 = new Employee(2,"divya",67000.9);
			Employee e2 = new Employee(4,"raj",77000.9);
			Employee e3 = new Employee(6,"ritik",35000.9);
			Employee e4 = new Employee(8,"rishika",22250.9);
			Employee e5 = new Employee(10,"neharika",11186.9);
			Employee e6 = new Employee(12,"srishti",24067.6);
			Employee e7 = new Employee(14,"sita",30000.5);
			Employee e8 = new Employee(16,"harsha",56000.2);
			Employee e9 = new Employee(18,"kavitha",40000.1);

			ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(e1);
			al.add(e2);
			al.add(e3);
			ArrayList<Employee> al1 = new ArrayList<Employee>();
			al1.add(e4);
			al1.add(e5);
			al1.add(e6);
			ArrayList<Employee> al2 = new ArrayList<Employee>();
			al2.add(e7);
			al2.add(e8);
			al2.add(e9);
			
			HashMap<String,ArrayList<Employee>> hm  = new HashMap<>();
			hm.put("first",al);
			hm.put("second",al1);
			hm.put("third",al2);
			
			ArrayList<Employee> second = hm.get("second");         //first.third you can give
			Iterator<Employee> it = second.iterator();
			
			while(it.hasNext()) {
				Employee ep = it.next();
			System.out.println("id is "+ep.id);	
			System.out.println("name is "+ep.name);	
			System.out.println("salary is "+ep.salary);	
			System.out.println("==========================");
			}
			
		}

	}

