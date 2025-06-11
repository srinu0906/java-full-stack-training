package com.srinu;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
//		ArrayList<Object> al = new ArrayList<>();
		ArrayList al = new ArrayList<>();

		al.add("Srinu");
		al.add("Vasu");
		al.add("Srinu");
		al.add("Vasu");
		al.add(5);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.size());
		al.clear();
		System.out.println(al.size());
		System.out.println(al.isEmpty());


		
	}
}
