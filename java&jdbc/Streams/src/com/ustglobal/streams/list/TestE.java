package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(70);
		marks.add(50);
		marks.add(80);
		marks.add(45);
		marks.add(30);
		
		Comparator<Integer> cmp = (m1, m2)->{    //sort data in ascending order
			if(m1>m2) {
				return 1;
			}
			else if(m1<m2)
			{
				return -1;
			}
			else {
				return 0;
			}
		};
		
		long noOfFailedStudents =		
	    marks.stream().filter(i-> i<40).count();          //for modification in data use map
		System.out.println(noOfFailedStudents);
		
		System.out.println("===================");
		Integer i = marks.stream().min(cmp).get();
		System.out.println("min value " +i);
		
		
		System.out.println("===================");
		Integer j = marks.stream().max(cmp).get();
		System.out.println("max value " +j);
	}

}
