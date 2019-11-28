package com.ustglobal.sorting.list;

public class Student implements Comparable<Student>{
	int id;
	String name;
	double marks;

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	//sorting by id==========================================================

	//	@Override
	//	public int compareTo(Student s) {
	//
	//		if(this.id>s.id)
	//		{
	//			return 1;
	//		}
	//		else if(this.id<s.id)
	//		{
	//			return -1;
	//		}
	//		else {
	//			return 0;
	//		}

	//sorting by marks==========================================================


	//	@Override
	//	public int compareTo(Student s) {
	//
	//		if(this.marks>s.marks)
	//		{
	//			return 1;
	//	}
	//	else if(this.marks<s.marks)
	//		{
	//			return -1;
	//		}
	//		else {
	//			return 0;
	//		}
	//sorting by name==========================================================

	
	
//	@Override
//	public int compareTo(Student s) {
//
//		String p = this.name;
//		String q = s.name;
//		//return p.compareToIgnoreCase(q);
//		return p.compareTo(q);
//	}
		
		
		
		@Override
		public int compareTo(Student s) {

			//int i  = this.id;
			//int j = s.id;                   //invalid don't use
			
			Integer i = this.id;
			Integer j = s.id;
			
			return i.compareTo(j);
		}
		
		
	}

