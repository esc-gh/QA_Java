package iteration;

public class Numbers {
	int num;
	int dig1;
	int dig2;
	int sum;
	String s1;

	public void number(int num) {
		if (num < 10 | num > 99) {
			System.out.println("Please enter a number between 10-99.");
		} else {
			dig1 = num / 10;
			dig2 = num % 10;
			sum = dig1 + dig2;
			System.out.println(sum);
		}
	}

	public void number99(int num) {
		dig1 = num / 10;
		dig2 = num % 10;
		String[] onedigit = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
		String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		if (num < 20 & num >= 0) {
			System.out.println(onedigit[num]);
		} if (num >= 20 & num <= 99) {
			System.out.println(multipleoftens[dig1]+onedigit[dig2]);
		}
	}
}
