package com.srinu;

public class ThrowThrowsDemo {
	
	static void checkAge(int age) throws ArithmeticException {
		
//		int a = 100;;
//		int b = a/0;
		
		if (age < 18) {
			throw new ArithmeticException("Age must be 18 above to vote");
		} else {
			System.out.println("You are eligible to vote");
		}
	}

	public static void main(String[] args) {
		
//		try {
//			checkAge(5);
//		}catch(ArithmeticException e) {
//			System.out.println("Exception caught");
//		}
		
		
		checkAge(25);
	}

}
