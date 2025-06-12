package com.srinu;


// creating thread by extending the thread class

public class ThreadDemo extends Thread{
	
	public void run() {
		System.out.println("run method of  ThreadDemo class");
	}

	public static void main(String[] args) {
		
		ThreadDemo td = new ThreadDemo();
		
		td.start();
	}

}
