package com.srinu;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Srinu");
		lhs.add("Srinu");
		lhs.add(10);
		lhs.add(1.5);
		lhs.add('v');
		lhs.add(null);
		
		System.out.println(lhs);
		
	}

}
