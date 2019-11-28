package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {
	
	public static void main(String[] args) {
		
		
		ArrayList <Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12, "ram", 56.7);
		Student s2 = new Student(22,"jai",65.5);
		Student s3 = new Student(32,"Sweety",79.7);
		Student s4 = new Student(42,"dimple",83.7);
		Student s5 = new Student(52,"Rishika",90.7);
		
		

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
	     
		System.out.println("before sorting---");
		displayStudentDetails(al);
		Collections.sort(al);
		
		System.out.println("after sorting---");
		Collections.sort((List<Student>) al);
		
	}
	static void displayStudentDetails(ArrayList<Student>al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("marks is "+s.marks);
			System.out.println("-------------------------");
		}
	}

}
