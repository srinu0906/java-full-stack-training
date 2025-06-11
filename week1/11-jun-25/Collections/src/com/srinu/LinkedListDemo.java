package com.srinu;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList<>();
		list.add("Srinu");
		list.add("Vasu");
		list.add(100);
		list.add('c');
		list.add(2.5);
		list.add("Srinu");
		
		Student std = new Student();
		list.add(std);
		
		System.out.println(list);


	}

}
