package com.ustglobal.streams.list;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
public class TestF {

		public static void main(String[] args) {
			
			ArrayList<Integer> marks = new ArrayList<Integer>();
			marks.add(20);
			marks.add(70);
			marks.add(50);
			marks.add(80);
			marks.add(45);
			marks.add(30);
			
			List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
			Iterator<Integer> it = l.iterator();
			System.out.println("sorted");
			while(it.hasNext())
			{
				Integer i = it.next();
				System.out.println(i);
			
			
		}

	}


}
