package com.ustglobal.collectionframework.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	

		public static void main(String[] args) {


			Vector li = new Vector();
			li.add(12);
			li.add("ram");
			li.add(true);
			li.add(12.97);
			li.add(null);
			System.out.println("***************for loop********************");


			for(int i=0;i<li.size();i++)
			{
				System.out.println((li.get(i)));
			}

			System.out.println("***************forEach loop********************");


			for(Object object :li)
			{
				System.out.println(object);
			}

			System.out.println("*************** iterator********************");

			Iterator it = li.iterator();
			while(it.hasNext())
			{
				Object o = it.next();
				System.out.println(o);

			}
			
			System.out.println("***************List iterator ********************");

			ListIterator lt1 = li.listIterator();
			while(lt1.hasNext())
			{
				Object o = lt1.next();
				System.out.println(o);

			}
			System.out.println("***************List iterator forward********************");

			ListIterator lt = li.listIterator();
			while(lt.hasNext())
			{
				Object o = lt.next();
				System.out.println(o);

			}
			
			System.out.println("***************List iterator backward********************");
			while(lt.hasPrevious())
			{
				Object o = lt.previous();
				System.out.println(o);

			}

		}
}

