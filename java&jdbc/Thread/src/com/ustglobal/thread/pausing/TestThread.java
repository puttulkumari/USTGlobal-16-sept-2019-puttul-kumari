package com.ustglobal.thread.pausing;

public class TestThread {
	public static void main(String[] args) {
		
		
		System.out.println("main thread started");
		MyThread t = new MyThread();
		t.start();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		
		System.out.println("main thread ended");
	}

}
 