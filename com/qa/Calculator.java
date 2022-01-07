package com.qa;

public class Calculator {
	
	public int addition(int int1, int int2) {
		int result = int1 + int2;
		return result;
	}
	
	public int multiply(int int1, int int2) {
		int result = int1 * int2;
		return result;
	}
	
	public int subtract(int int1, int int2) {
		int result = int1 - int2;
		return result;
	}
	
	public void divide(int int1, int int2) {
		double result = int1 / int2;
		if (int1 >= int2) {
			System.out.println("First number must be smaller than second number.");
//			return result;
		}
		else if (int1 > int2) {
			System.out.println(result);
//			return result;
		}
//		return result;
		
			
		}
	}
