package com.srinu;

//creating thread by implementing Runnable interface
public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Runnable thread is running");
	}

	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		
		t.start();
		
		
	}

}
