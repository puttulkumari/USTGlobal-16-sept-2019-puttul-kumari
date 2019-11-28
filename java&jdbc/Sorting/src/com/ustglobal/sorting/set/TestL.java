package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestL {
	public static void main(String[] args) {

		//sorted by height
		Comparator<Employee1> comp = (e1,e2)->{             //lambada expression no need for implements
			if(e1.height >e2.height)
			{
				return 1;
			}
			else if(e1.height <e2.height)
			{return -1;

			}
			else {
				return 0 ;
			}
		};




		TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);

		Employee1 e1 =new Employee1(4,"ritu",5.7);
		Employee1 e2 =new Employee1(7,"tina",7.7);
		Employee1 e3 =new Employee1(11,"mina",3.3);
		Employee1 e4 =new Employee1(8,"sonu",4.8);


		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("*****************usting iterator******");
		Iterator<Employee1> it = ts.iterator();
		while(it.hasNext())
		{
			Employee1 e = it.next();

			System.out.println("name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("height is "+e.height);
			System.out.println("***************");
		}

	}

}
