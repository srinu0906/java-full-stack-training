package com.srinu;

public class Test {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.setRollNo(101);
		std.setName("Srinu");
		std.setAge(20);
		
		System.out.println("Student RollNo: " + std.getRollNo());
		System.out.println("Student Name: " + std.getName());
		System.out.println("Student Age: " + std.getAge());

	}

}
