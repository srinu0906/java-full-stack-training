package com.srinu;

public class Test {

	public static void main(String[] args) {

//		int a = 10;
//		Integer obj = Integer.valueOf(a);
//		
//		int b = obj.intValue();

		
//		float a = 10.0f;
//		
//		Float obj = Float.valueOf(a);
//		
//		float b = obj.floatValue();
		
		
		byte a = 5;
		Byte obj = Byte.valueOf(a);
		byte b = obj.byteValue();
		
		System.out.println("Wrapper Object :"+obj);
		System.out.println("Primitive Value :"+b);

	}

}
