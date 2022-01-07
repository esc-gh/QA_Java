package com.qa;
public class Runner2 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.addition(1,5));
		System.out.println(calc.multiply(3,5));
		System.out.println(calc.subtract(8,5));
		calc.divide(11,5);
		
		Results result = new Results();
		
		result.physics = 134;
		result.chemistry = 88;
		result.biology = 67;
		
//		result.marks();
		result.percent();
	}
}