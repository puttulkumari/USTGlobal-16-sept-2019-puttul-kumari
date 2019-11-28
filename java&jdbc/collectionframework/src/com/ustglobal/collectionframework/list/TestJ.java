package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		
		
		
		ArrayList <Student> al = new ArrayList<Student>();
		Student s1 = new Student(1,"rita",78.9);
		Student s2 = new Student(2,"rina",66.9);
		Student s3 = new Student(3,"renu",55.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		System.out.println("---------------using for------------------");
		
		for(int i=0;i<al.size();i++)
		{
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("marks is "+s.marks);
		}
		System.out.println("****************using for each*************");
		for(Student s : al)
		{
			
			System.out.println(s);
			
		}
	}

}
