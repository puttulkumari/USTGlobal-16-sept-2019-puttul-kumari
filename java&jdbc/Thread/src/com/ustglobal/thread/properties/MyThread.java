package com.ustglobal.thread.properties;


public class MyThread  extends Thread
{
	public static void main(String[] args) 
	{
		
		System.out.println("main started");
		String tname = Thread.currentThread().getName();
		System.out.println("current thread "+ tname);                          //main Thread
		
		
		MyThread t1  = new MyThread();
		String mname = t1.getName();
		System.out.println("My thread name:"+ mname);                               //Thread-0
		
		Thread.currentThread().setName("bala");                                    //bala Thread
		
		t1.setName("golu");
		System.out.println("my new thread :"+ t1.getName());                       //golu Thread
		
		System.out.println(10/0);
		
		System.out.println("main ended");
	}

}
