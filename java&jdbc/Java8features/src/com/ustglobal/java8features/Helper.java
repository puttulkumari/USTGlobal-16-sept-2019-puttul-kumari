package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al)
	{

		Iterator<Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("id is"+s.id);
			System.out.println("name is "+s.name);
			System.out.println("marks is "+s.marks);
			System.out.println("==============");
		}

	}

	void displayFailedStudent(ArrayList<Student> al)
	{
		List<Student> l =
				al.stream().filter(Student -> Student.marks <40).collect(Collectors.toList());

		Iterator<Student> it = l.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("id is"+s.id);
			System.out.println("name is "+s.name);
			System.out.println("marks is "+s.marks);
			System.out.println("==============");
		}


	}
	
	
	
	
	
	void displayPassStudent(ArrayList<Student> al)
	{
		List<Student> l =
				al.stream().filter(Student -> Student.marks >=40).collect(Collectors.toList());

		Iterator<Student> it = l.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("id is"+s.id);
			System.out.println("name is "+s.name);
			System.out.println("marks is "+s.marks);
			System.out.println("==============");
		}


	}
	
	Comparator<Student> cmp = (s1,s2)->
	{
		if(s1.marks>s2.marks)
		{
			return 1;
		}
		else if(s1.marks<s2.marks)
		{
			return -1;
		}
		else {
			return 0;
		}
	};
	void displayTopperStudent(ArrayList<Student> al)
	{
		Student s1 =
				al.stream().max(cmp).get();

	
		
			System.out.println("id is"+s1.id);
			System.out.println("name is "+s1.name);
			System.out.println("marks is "+s1.marks);
			System.out.println("==============");
		

}
}