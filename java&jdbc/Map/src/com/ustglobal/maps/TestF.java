package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF 
{
	public static void main(String[] args) 
	{


		Student s1 = new Student(2,"divya",67.9);
		Student s2 = new Student(4,"raj",77.9);
		Student s3 = new Student(6,"ritik",99.9);
		Student s4 = new Student(8,"rishika",50.9);
		Student s5 = new Student(10,"neharika",86.9);
		Student s6 = new Student(12,"srishti",67.6);
		Student s7 = new Student(14,"sita",63.5);
		Student s8 = new Student(16,"harsha",45.2);
		Student s9 = new Student(18,"kavitha",76.1);



		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String,ArrayList<Student>> hm  = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		ArrayList<Student> first = hm.get("second");
		Iterator<Student> it = first.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
		System.out.println("id is "+s.id);	
		System.out.println("name is "+s.name);	
		System.out.println("marks is "+s.marks);	
		System.out.println("==========================");
		}
		
	}

}
