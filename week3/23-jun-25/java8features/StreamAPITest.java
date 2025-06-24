package com.srinu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPITest {
	
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		List<Integer> evenSquare = numbers.stream().filter(n -> n%2 == 0).map(n -> n*n)
//		.collect(Collectors.toList());
//		
//		System.out.println("Even Squares:"+evenSquare);
		
		List<Integer> oddNums = numbers.stream().filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		System.out.println("Odd numbers :");
		oddNums.forEach(num -> System.out.println(num));
	}


}
