package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;

public class TestK {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5,"rama",77.6));
		al.add(new Student(3,"yash",84.6));
		al.add(new Student(6,"vivek",55.6));
		al.add(new Student(2,"rita",67.9));
		al.add(new Student(5,"sakil",88.3));
		al.add(new Student(1,"shalu",30.3));
		
		Helper h = new Helper();
		h.displayAllStudent(al);
		h.displayFailedStudent(al);
		
		h.displayPassStudent(al);
		System.out.println("=============topper is===============");
	h.displayTopperStudent(al);
	}

}
