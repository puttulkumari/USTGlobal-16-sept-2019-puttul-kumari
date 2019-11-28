package com.ustglobal.arrays;

public class TestC {
	public static void main(String[] args) {
		
		
		Student s1 = new Student(1,"ram",89.9);
		Student s2 = new Student(3,"ramesh",65.7);
		Student s3 = new Student(5,"ramakriti",77.7);
		
		
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		
		
		for(Student s: students)
		{
			System.out.println(s);
		}
		receive(students);
	}
		static void receive(Student[] stu)
		{
			for(Student s : stu)
			{
				System.out.println(s);
			}
		}
		
	}


