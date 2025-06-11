package com.srinu;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(100);
		hs.add(100);
		hs.add(100);
		hs.add(45);
		hs.add(7);
		hs.add(null);
		System.out.println(hs);
	}
}
