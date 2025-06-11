package com.srinu;

public class Demo {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		
		t.setTeacherId(101);
		t.setName("Vasu");
		t.setSalary(50000.00);
		
		System.out.println("Teacher ID: " + t.getTeacherId());
		System.out.println("Teacher Name: " + t.getName());
		System.out.println("Teacher Salary: " + t.getSalary());
	}

}
