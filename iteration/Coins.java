package iteration;

public class Coins {

	int tenPounds = 0;
	int pounds = 0;
	int tenPennies = 0;
	int pennies = 0;

	public void change(double cost, double cash) {
		double change = cash - cost;
		System.out.println("Change required: £" + change);
		change = (int) (cash * 100 - cost * 100);
		String output = "";

		while (change > 0) {
			if (change >= 1000) {
				change -= 1000;
				tenPounds += 1;
			} else if (change >= 100) {
				change -= 100;
				pounds += 1;
			} else if (change >= 10) {
				change -= 10;
				tenPennies += 1;
			} else {
				change -= 1;
				pennies += 1;
			}
		}
		int fifties = tenPounds / 5;
		int twenties = (tenPounds % 5) / 2;
		int tens = (tenPounds % 5) % 2;
		int fives = pounds / 5;
		int twos = (pounds % 5) / 2;
		int ones = (pounds % 5) % 2;
		int fiftyP = tenPennies / 5;
		int twentyP = (tenPennies % 5) / 2;
		int tenP = (tenPennies % 5) % 2;
		int fiveP = pennies / 5;
		int twoP = (pennies % 5) / 2;
		int oneP = (pennies % 5) % 2;

		if (fifties > 0) {
			output += fifties + "x £50 note(s)\n";
		}
		if (twenties > 0) {
			output += twenties + "x £20 note(s)\n";
		}
		if (tens > 0) {
			output += tens + "x £10 note(s)\n";
		}
		if (fives > 0) {
			output += fives + "x £5 note(s)\n";
		}
		if (twos > 0) {
			output += twos + "x £2 coin(s)\n";
		}
		if (ones > 0) {
			output += ones + "x £1 coin(s)\n";
		}
		if (fiftyP > 0) {
			output += fiftyP + "x 50p coin(s)\n";
		}
		if (twentyP > 0) {
			output += twentyP + "x 20p coin(s)\n";
		}
		if (tenP > 0) {
			output += tenP + "x 10p coin(s)\n";
		}
		if (fiveP > 0) {
			output += fiveP + "x 5p coin(s)\n";
		}
		if (twoP > 0) {
			output += twoP + "x 2p coin(s)\n";
		}
		if (oneP > 0) {
			output += oneP + "x 1p coin(s)";
		}

		System.out.println(output);
	}
}
