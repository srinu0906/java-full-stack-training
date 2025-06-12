package com.srinu;

// Exception Handling

public class Test {

	public static void main(String[] args) {

//		try {
//			int a = 100;
//			int b = a/0;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Cannot divide number by zero");
//		} 
//		catch(Exception e) {
//			System.out.println(" divide number by zero not allowed");
//		}
//		finally {
//			System.out.println("Execution completed");
//		}
		
//		try {
//			int [] arr = new int[5];
//			arr[5] = 100;
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Arraay index is not there");
//		} 
//		catch(Exception e) {
//			System.out.println(" Array index out of bounds");
//		}
//		finally {
//			System.out.println("Execution completed");
//		}
		
		try {
			
			System.out.println("Outer try block");
				
			try {
				int a = 100;
				int b = a/0;
			}
			catch(ArithmeticException e) {
				System.out.println("Cannot divide number by zero");
			}
			
			int [] arr = new int[5];
			arr[5] = 100;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index  is not there");
		} 
		

	}

}
