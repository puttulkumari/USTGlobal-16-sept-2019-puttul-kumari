package com.ustglobal.java8features;

import java.util.function.Consumer;


public class TestJ {
	public static void main(String[] args) {


		Consumer<Student> c = s ->{

			System.out.println("id is:"+s.id);
			System.out.println("name is:"+s.name);
			System.out.println("marks is:"+s.marks);
			System.out.println("=====================");

		};

		Student s1 = new Student(2,"bhavya",87.5);
		c.accept(s1);
	}
}
