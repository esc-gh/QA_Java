package com.qa;

public class DataTypeExt {
	public static void main(String[] args) {
		class Fraction {
			public int numerator;
			public int denominator;
			
			public Fraction(int numerator, int denominator) {
				this.numerator = numerator;
				this.denominator = denominator;
			}
			public String getFraction() {
				String Fraction = this.numerator+"/"+this.denominator;
				return Fraction;
			}
		}
			Fraction f1 = new Fraction(1,3);
			Fraction f2 = new Fraction(4,7);
		
			System.out.println(f1.getFraction());
			System.out.println(f2.getFraction());
	}	
}
