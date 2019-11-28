package com.ustglobal.java8features;
import java.util.function.Supplier;
public class TestI {
	
		public static void main(String[] args) {

			Supplier<Student> s =() ->new Student(5,"siksha",87.8);
			
			Student s1 = s.get();
			System.out.println("id is:"+s1.id);
			System.out.println("name is:"+s1.name);
			System.out.println("marks is:"+s1.marks);
			
			Supplier<Integer> i =()->20;
			int val = i.get();
			System.out.println("value is "+val);
			
			
			Supplier<String> sp =()->"Good Evening";
			String v = sp.get();
			System.out.println("value is "+v);
		}
	}

